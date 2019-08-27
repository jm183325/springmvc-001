package springmvc.exception;

import javax.servlet.ServletException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionMapping {
	@ExceptionHandler({Exception.class})
	public ModelAndView ExceptionMapping(Exception e) {
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.addObject("e",e);
		modelAndView.setViewName("error");
		return modelAndView;
	}
}
