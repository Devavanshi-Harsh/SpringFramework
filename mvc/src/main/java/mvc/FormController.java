package mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@Autowired
	private ServiceLayer userService;
	@RequestMapping("/SignUp")
	public String signUp() {
		return "form";
	}

//	@RequestMapping(path = "processForm", method = RequestMethod.POST)
//	public String processForm(@RequestParam("email") String eMail, @RequestParam("fName") String fName,
//			@RequestParam("lName") String lName, @RequestParam("password") String password, Model model) {
//		model.addAttribute("eMail", eMail);
//		model.addAttribute("fName", fName);
//		model.addAttribute("lName", lName);
//		model.addAttribute("password", password);		
//		return "Thanks";
//	}
	@RequestMapping(path = "processForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute User user) {
		this.userService.createUser(user);
		return "Thanks";
	}
	@ModelAttribute
	public void commonMethod(Model model) {
		String s  = "This is comman data";
		model.addAttribute("comData", s);
	}
}
