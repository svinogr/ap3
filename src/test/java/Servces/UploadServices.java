package Servces;

import ap.config.HibernateConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import java.io.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = HibernateConfig.class)
public class UploadServices {

    @Test
    public void uploadeTest() {
        File saveFile = new File(".\\web\\image\\" + "новый файл.jpg");
        BufferedOutputStream outputStream = null;
        BufferedInputStream inputStream = null;
        try {inputStream = new BufferedInputStream(new FileInputStream("C:\\icon.jpg"));
            byte[] mass = new byte[inputStream.available()];
            inputStream.read(mass);
                outputStream = new BufferedOutputStream(new FileOutputStream(saveFile));
                outputStream.write(mass);
                outputStream.flush();
                outputStream.close();
            } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
