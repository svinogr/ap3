package ap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;
import java.util.UUID;

public class UploadServiceImpl implements UploadService {

    @Autowired
    Environment environment;

    @Override
    public String uploadFile(MultipartFile file) {
        String name;
        if (!file.isEmpty()) {
            UUID id = UUID.randomUUID();
            name = id.toString().replaceAll("-", "") + ".jpg";
            //TODO сделать добавление отсутсвующей картиник и валидацию на тип файла
          //  File saveFile = new File(".\\web\\" + name);
            File saveFile = new File(environment.getRequiredProperty("location")+ name);
            name = saveFile.getPath().substring(6);
            try {
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(saveFile));
                outputStream.write(file.getBytes());
                outputStream.flush();
                outputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else name = "Нет Фото";
        return name;
    }
}
