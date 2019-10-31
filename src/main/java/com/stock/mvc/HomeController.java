package com.stock.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

		// private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
/*
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
*/
		/**
		 * Simply selects the home view to render by returning its name.
		 */

		@GetMapping("/home")
		public String home(Locale locale, Model model) {
			// logger.info("Welcome home! The client locale is {}.", locale);
		
			Date date = new Date();
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
			String formattedDate = dateFormat.format(date);
		
			model.addAttribute("serverTime", formattedDate );
		
			return "home";
		}		

}
