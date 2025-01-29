package Tests;

import Pages.FileDownloadPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileDownloadTest extends SeleniumBaseTest {
    @Test
    public void testFileDownload() throws IOException {
        FileDownloadPage.Instance.enterThePage();
        FileDownloadPage.Instance.downloadFile();
    }
}
