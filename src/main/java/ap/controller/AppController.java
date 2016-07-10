package ap.controller;

import ap.DAO.DriverDAO;
import ap.entity.BDriver;
import ap.entity.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("search")
public class AppController {

    @Autowired
    DriverDAO driverDAO;

    /**The Controller is opens start page
     * @return
     */
    @RequestMapping("/")
    public ModelAndView getGeneralPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("search", new Search());
        modelAndView.addObject("driver", driverDAO.getAll());
        modelAndView.setViewName("index");
        return  modelAndView;
    }

    @ModelAttribute
    public Search get(){
        return new Search();
    }


    /**The Controller return page for login users
     * @param model
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String getLoginPage(Model model){
        return"login";
    }



}
