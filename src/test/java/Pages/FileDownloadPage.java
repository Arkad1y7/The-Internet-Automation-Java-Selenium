package Pages;

import SeleniumBase.SeleniumBasePage;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.BasicHttpContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class FileDownloadPage extends SeleniumBasePage {
    public static FileDownloadPage Instance = new FileDownloadPage();

    // Метод для перехода на страницу загрузки файлов
    public void enterThePage() {
        driver.get("https://the-internet.herokuapp.com/download");
    }

    // Метод для скачивания файлов
    public void downloadFile() throws IOException {
        ArrayList<WebElement> files = new ArrayList<>();

        // Находим все ссылки для скачивания файлов
        for (int i = 1; i < 125; i++) {
            files.add(driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[" + i + "]")));
            String downloadLink = files.get(i - 1).getAttribute("href");

            // Указываем путь для сохранения файла
            File fileToSave = new File("C:\\Users\\arkad\\Downloads\\SeleniumTempFolder\\file_" + i + ".zip");

            // Скачиваем файл с использованием HttpClient
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(downloadLink);
            HttpResponse response = httpClient.execute(httpGet, new BasicHttpContext());

            // Копируем содержимое InputStream в файл
            copyInputStreamToFile(response.getEntity().getContent(), fileToSave);

            // Закрываем HttpClient
            httpClient.close();
        }
    }

    // Метод для копирования InputStream в файл
    private void copyInputStreamToFile(InputStream inputStream, File file) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(file)) {
            byte[] buffer = new byte[1024]; // Буфер для чтения данных
            int bytesRead;

            // Чтение данных из InputStream и запись в OutputStream
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close(); // Закрываем InputStream
            }
        }
    }
}