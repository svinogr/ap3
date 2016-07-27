package ap.controller;

import ap.DAO.SearchDAO;
import ap.entity.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {

    @Autowired
    SearchDAO searchDAO;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView searchByNumber(@ModelAttribute("search")Search search){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("searched", searchDAO.getAllByNumber(search));
        modelAndView.setViewName("searched");
        return modelAndView;
    }
}



