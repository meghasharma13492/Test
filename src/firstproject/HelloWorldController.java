package firstproject;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
  
@Controller  
public class HelloWorldController {  
      
    @RequestMapping("/abc")  
    public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res) throws IOException {  
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        if(password.equals("admin")){  
        String message = "HELLO "+name;  
        return new ModelAndView("hellopage", "message", message);  
        }  
        else{  
            return new ModelAndView("error", "message","Sorry, username or password error");
        }  
    }  
    
    @RequestMapping("/logged")  
    public ModelAndView logged(HttpServletRequest request,HttpServletResponse res) {  
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
//        if(password.equals("admin")){  
        String message = "HELLO "+name;  
        return new ModelAndView("hellopage", "message", message);  
//        }  
//        else{  
//            return new ModelAndView("error", "message","Sorry, username or password error");  
//        }  
    } 
      
}  
