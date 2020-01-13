package bootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public  String  showLoginForm(){
		return "Login";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView validate(@RequestParam("username") String user,@RequestParam("password") String pass){
		ModelAndView mav= new ModelAndView();
		mav.setViewName("Welcome");
		mav.addObject("username",user);
		return mav;
	}
}
