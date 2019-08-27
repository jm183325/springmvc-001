package springmvc.requestMapping;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@RequestMapping("/spring")
@Controller
public class RequertMapping {
	@RequestMapping(value="/method",method=RequestMethod.POST)
	public String RequestMethod() {
		System.out.println("method");
		return "success";
	}
	@RequestMapping(value="/params",params= {"userName"})
	public String params(String userName,String password) {
		System.out.println(userName+"====params==="+password);
		return "success";
	}
	@RequestMapping(value="/headers",headers= {"Accept-Language=zh-CN,zh;q=0.9"})
	public String headers() {
		System.out.println("====headers===");
		return "success";
	}
	@RequestMapping("/url/{id}")
	public String url(@PathVariable String id) {
		System.out.println("====headers==="+id);
		return "success";
	}
	@RequestMapping("/requestParam")
	public String requestParam(@RequestParam("idt") String id) {
		System.out.println(id);
		return "success";
	}
	@RequestMapping("/requestHeader")
	public String requestHeader(@RequestHeader("Accept-Language") String id) {
		System.out.println(id);
		return "success";
	}
	@RequestMapping("/requestCookie")
	public String requestCookie(@CookieValue("JSESSIONID") String id) {
		System.out.println(id);
		return "success";
	}
	@RequestMapping("/requestPojo")
	public String requestPojo( Person person) {
		System.out.println(person);
		return "success";
	}
	@RequestMapping("/servletApi")
	public String requestPojo( HttpServletRequest request,HttpServletResponse response,Writer writer,InputStream is,OutputStream os,HttpSession session) {
		System.out.println(request+"==="+response);
		return "success";
	}
}
