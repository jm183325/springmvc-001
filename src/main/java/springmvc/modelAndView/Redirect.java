package springmvc.modelAndView;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Redirect {
	@RequestMapping("/redirectMapping")
	private String redirectMappling(Model model) {
		model.addAttribute("a","123");
		System.out.println("redirect:model");
		return "redirect:success.jsp";
	}
}
