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
import org.springframework.web.servlet.view.RedirectView;

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
	public String processForm(@ModelAttribute User user, Model model) {
		int id = this.userService.createUser(user);
		String msg = "User is create with ID : " + id;
		model.addAttribute("message", msg);
		return "Thanks";
	}

//	@ModelAttribute
//	public void commonMethod(Model model) {
//		String s = "This is comman data";
//		model.addAttribute("comData", s);
//	}

	@RequestMapping("/one")
//	public RedirectView one() {
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl("https://www.google.com");
//		return redirectView;
//	@RequestMapping("/two")
//	public String two() {
//		return "two";
//	}
	
	// the search application
	public String one() {
		return "one";
	}
	@RequestMapping("two")
	public RedirectView two(@RequestParam("searchField") String s) {
//		public String two(@RequestParam("searchField") String s) {
		String url  = "https://www.google.com/search?q="+s;
//		return "redirect:"+url; 
		RedirectView r = new RedirectView();
		r.setUrl(url);
		return r;
	}

}
