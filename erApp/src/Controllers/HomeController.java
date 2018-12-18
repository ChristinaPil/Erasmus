package Controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String form(FirstPage firstpage) {
	        firstpage.addAttribute("title", "loginform");
	        return "loginform";
	}
	
	
	
	@RequestMapping("/loginform")
	public String validateprocess(HttpServletRequest request, FirstPage firstpage) {
	   String username = request.getParameter("username");
	   
	   String password = request.getParameter("password");
	   
	   boolean isHeadSecretary = "headsecretary";
       boolean isStudent = "student";
       
	   
	   if (isHeadSecretary){
		   return "headsecretary/";
	   }
	   
	   if (isStudent) {
		   return "student/";   
	   

	   }else {
		   firstpage.addAttribute("Username or password is not correct");
		   return "error/";
	   }
		   
	 
}
	

	
	
	
	
	
	
	
	
	
	
	


}
