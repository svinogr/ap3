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

import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes("search")
public class AppController {

    @Autowired
    DriverDAO driverDAO;

    /**
     * The Controller opens start page with first 10 drivers
     *
     * @return
     */
    @RequestMapping("/")
    public ModelAndView getGeneralPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("search", new Search());
        modelAndView.addObject("driver",  driverDAO.getDriverByInterval(0));
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @ModelAttribute
    public Search get() {
        return new Search();
    }


    /**The Controller opens page with driver by interval
     * @param request
     * @return
     */
    @RequestMapping(value = "/new", params = "page")
    public  ModelAndView getGeneralPage(HttpServletRequest request) {
        int startInterval = Integer.parseInt(request.getParameter("page"));
        System.out.println(startInterval);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("search", new Search());
        modelAndView.addObject("driver", driverDAO.getDriverByInterval(startInterval));
        modelAndView.setViewName("index");
        return modelAndView;
    }


    /**
     * The Controller return page for login users
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String getLoginPage(Model model) {
        return "login";
    }


}
