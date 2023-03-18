package complexFormHandling.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import complexFormHandling.Entity.Visitor;

@Controller
public class ComplexFormController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/complex")
	public String complexForm() {
		return "ComplexForm";
	}
	@RequestMapping(path= "complexFormProcess", method = RequestMethod.POST)
		public String fire(@ModelAttribute Visitor visitor, Model model) {
		System.out.println(visitor);
		return "HandledData";
	}
}
