package ap.controller;

import ap.DAO.DriverDAO;
import ap.entity.BDriver;
import ap.entity.DriverImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("search")
public class DriverController {

    @Autowired
    DriverDAO driverDAO;

    /**The Controller add new bDriver in BD
     * @param bDriver
     * @return
     */
    @RequestMapping(value = "/confidential/addNewDriver", method = RequestMethod.POST)
    public ModelAndView addNewBadDriver(@ModelAttribute("driver")BDriver bDriver){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addDriver");
        modelAndView.addObject("driver", new BDriver());
        bDriver.setNumber(bDriver.getNumber().toLowerCase());
        //TODO реализовать форму и добавление картинки к обьекту и в базу
        DriverImage driverImage = new DriverImage();
        driverDAO.add(bDriver);
        return modelAndView;
    }
    /**The Controller is opens jsp page for creating new bDriver
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
