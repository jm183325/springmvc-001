package springmvc.modelAndView;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import springmvc.requestMapping.Address;
import springmvc.requestMapping.Person;
//放到session域中只能放在类上value=属性名type=类名
//@SessionAttributes(types=Person.class)
@SessionAttributes(value="a" )
@RequestMapping("/model")
@Controller
public class View {
	@RequestMapping("/modelAndView")
	private ModelAndView modelAndView() {
		ModelAndView model=new ModelAndView("model");
		Person person = new Person("1","2",null);
		model.addObject("a",person);
		return model;
	}
	/**
	 * 把模型数据放请求域中
	 * @param m
	 * @return
	 */
	@RequestMapping("/model")
	private String model(Model m) {
		m.addAttribute("a","134");
		return "model";
	}
	@RequestMapping("/map")
	private String map(Map<String,String> m) {
		m.put("a", "tt");
		return "model";
	}
	
//	@ModelAttribute
//	private void modelAttribute(Map<String,Person> m) {
//		Person person = new Person("1","2",new Address("1"));
//		m.put("a", person);
//	}
//	@RequestMapping("/modelAttribute")
//	private String modelAttributeResponse(Person person) {
//		return "model";
//	}

}
