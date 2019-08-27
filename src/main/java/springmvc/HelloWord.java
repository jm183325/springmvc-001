package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWord {
	@RequestMapping("/helloword")
	public String hellowrod() {
		System.out.println("helloword");
		return "helloView";
	}
}
