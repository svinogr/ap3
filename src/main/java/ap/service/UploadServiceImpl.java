package ap.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.UUID;

public class UploadServiceImpl implements UploadService {
    @Override
    public String uploadFile(MultipartFile file) {
        String name;
        if (!file.isEmpty()) {
            UUID id = UUID.randomUUID();
             name= id.toString().replaceAll("-", "") + ".jpg";
            File saveFile = new File("C:\\f\\" + name);
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
