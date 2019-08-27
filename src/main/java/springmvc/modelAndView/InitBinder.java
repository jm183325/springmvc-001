package springmvc.modelAndView;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class InitBinder {
	@org.springframework.web.bind.annotation.InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.setDisallowedFields("userName");
	}
	@ResponseBody
	@RequestMapping("/person")
	public Person personInitBinder(@RequestBody Person p) {
		System.out.println(p);
		return p;
	}
	@ResponseBody
	@RequestMapping("/personFormat")
	public Person personFormat() {
		return new Person("123","56",new Date(),15.6);
	}
	
}
