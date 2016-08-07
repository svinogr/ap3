package ap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UploadController {

    @RequestMapping(value = "/testUpload", method = RequestMethod.GET)
    public String getUploadPage() {
        return "testUpload";
    }

/*    @RequestMapping(value = "/addImageTest", method = RequestMethod.POST)
    public void uploadImage(@RequestParam("file") MultipartFile file) {

        UUID id = UUID.randomUUID();
        String name =  id.toString().replaceAll("-","") + ".jpg";
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

    }

    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver multipartResolver() {
        return new CommonsMultipartResolver();
    }*/

}
