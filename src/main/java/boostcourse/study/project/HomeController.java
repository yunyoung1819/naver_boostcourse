package boostcourse.study.project;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "part01/test";
	}
	
	@RequestMapping(value = "/semanticLayout", method = RequestMethod.GET)
	public String layout() {
		
		logger.info("Layout Test!");
		
		return "part01/semanticLayout";
	}
	
	@RequestMapping(value = "/ex01", method = RequestMethod.GET)
	public String exercise01() {
		
		logger.info("ex01!");
		
		return "part01/ex01";
	}
	
	@RequestMapping(value = "/ex02", method = RequestMethod.GET)
	public String exercise02() {
		
		logger.info("ex02!");
		
		return "part01/ex02";
	}
	
	@RequestMapping(value = "/ex03", method = RequestMethod.GET)
	public String exercise03() {
		
		logger.info("ex03!");
		
		return "part01/ex03";
	}
	
	@RequestMapping(value = "/ex04", method = RequestMethod.GET)
	public String exercise04() {
		
		logger.info("ex04!");
		
		return "part01/ex04";
	}
	
}
