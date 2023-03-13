package springMVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model m) {
		System.out.println("This is home url...");
		m.addAttribute("name" , "Harsh Devavanshi");
		m.addAttribute("age" , 39);
		return "index" ;
	}
	@RequestMapping("/about")
	public String about(Model model) {
		List<String> str = new ArrayList<String>();
		str.add("cat");
		str.add("Dog");
		str.add("Wolf");
		model.addAttribute("list",str);
		System.out.println("This is about url...");
		return "about" ;
	}
}
