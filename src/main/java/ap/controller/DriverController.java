package ap.controller;

import ap.DAO.DriverDAO;
import ap.entity.BDriver;
import ap.entity.DriverImage;
import ap.entity.DriverType;
import ap.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("search")
public class DriverController {

    @Autowired
    DriverDAO driverDAO;

    @Autowired
    UploadService uploadService;

    /**
     * The Controller add new bDriver in BD
     *
     * @param bDriver
     * @return
     */
    @RequestMapping(value = "/confidential/addNewDriver", method = RequestMethod.POST)
    public ModelAndView addNewBadDriver(@ModelAttribute("driver") BDriver bDriver, @RequestParam("file") MultipartFile file) {
        System.out.println(bDriver.getType());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addDriver");
        modelAndView.addObject("driver", new BDriver());
        bDriver.setNumber(bDriver.getNumber().toLowerCase());
        if(file !=null){
            String nameUoloadFile = uploadService.uploadFile(file);
            DriverImage driverImage = new DriverImage();
            driverImage.setLink(nameUoloadFile);
            bDriver.setIdImage(driverImage);
        }
        driverDAO.add(bDriver);
        return modelAndView;
    }

    /**
     * The Controller is opens jsp page for creating new bDriver
     *
     * @return
     */
    @RequestMapping(value = "/confidential/addDriver", method = RequestMethod.GET)
    public ModelAndView addDriver() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("driver", new BDriver());
        modelAndView.setViewName("addDriver");
        return modelAndView;
    }


}
