package com.raj.shashi.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author rajs
 *
 */
@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView getHello(){
		ModelAndView model= new ModelAndView("HelloWorldPage");
		model.addObject("msg", "Hello World");
		return model;
	}

}
