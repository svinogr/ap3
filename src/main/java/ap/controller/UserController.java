package ap.controller;

import ap.DAO.UserDAO;
import ap.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("search")
public class UserController {

    @Autowired
    UserDAO userDAO;

    /**The Controller is opens page with form for registration new User
     * @return
     */
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView newUserRegistration(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", new User());
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    /** The Controller adds new User into DB and return result
     * @param user
     * @return
     */
    @RequestMapping(value = "/registrationNewUser", method = RequestMethod.POST)
    public ModelAndView registrationResponse(@ModelAttribute ("user") User user){
        userDAO.registration(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result", "Пользователь" +user.getName()+"добавлен");
        modelAndView.setViewName("registration");
        return modelAndView ;
    }

}
