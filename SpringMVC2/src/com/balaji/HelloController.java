package com.balaji;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView mymethod() {
		String message = "Hello First Spring";
		ModelAndView model1 = new ModelAndView("hellopage");
		model1.addObject("msg", message);
		return model1;
	}

	@RequestMapping("/")
	public ModelAndView indexPage() {
		String message = "Index Page";
		ModelAndView model1 = new ModelAndView("index");
		model1.addObject("msg", message);
		return model1;
	}

	@RequestMapping("/hello/{userName}")
	public ModelAndView userPage(@PathVariable("userName") String name) {
		String message = "Index Page of " + name;
		ModelAndView model1 = new ModelAndView("hellopage");
		model1.addObject("msg", message);
		return model1;
	}
}
