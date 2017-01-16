package firstproject.controllers;

import javax.servlet.http.*;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;

import firstproject.beans.*;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;  
  
@Controller  

public class LoginController {  
  
//	@RequestMapping("login")  
	@RequestMapping(value="/login", method = RequestMethod.GET)
    public ModelAndView helloWorld() {  
  System.out.println("Coming in controller");
        String message = "WELCOME SPRING MVC";  
        return new ModelAndView("login");
    }  
	@RequestMapping(value="/logged", method = RequestMethod.POST)
    public ModelAndView logged(HttpSession session,HttpServletRequest request,HttpServletResponse res) {  
        System.out.println("Coming in controller post ");
        System.out.println(request.getParameter("password"));
        String username = request.getParameter("name");
        String password = request.getParameter("password");
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        String message = "WELCOME SPRING MVC";  
        return new ModelAndView("redirect:/activities");          
    } 
}  
