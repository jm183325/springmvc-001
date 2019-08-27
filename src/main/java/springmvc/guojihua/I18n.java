package springmvc.guojihua;


import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class I18n {
	@Autowired
	private ResourceBundleMessageSource r;
	@RequestMapping("/i18n")
	public String i18nMapping(Locale locale) {
		System.out.println(r.getMessage("i18n.username", null, locale));
		return "i18n";
	}
}
