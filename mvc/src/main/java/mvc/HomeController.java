package mvc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model m) {
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
		return "about" ;
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("book","Atomic Habbits");
		modelAndView.addObject("cost", "$33");
		modelAndView.addObject("Author","James Clear");
		LocalDateTime c = LocalDateTime.now();
		modelAndView.addObject("time", c);
		
		List<String> str = new ArrayList<String>();
		str.add("cat");
		str.add("Dog");
		str.add("Wolf");
		modelAndView.addObject("listObject", str);
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
