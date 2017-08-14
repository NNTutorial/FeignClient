package com.nishant.spring.eureka.producer.producerforeurekademo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {
	
	@RequestMapping(value="/def",method=RequestMethod.GET)
	public String getString() {
		return "This is default string";
	}
	@RequestMapping(value="/param/{str}",method=RequestMethod.GET)
	public String getStrParam(@PathVariable(value = "str") String str) {
		return "This is param string with str :"+str;
	}
	@RequestMapping(value="/add/{str}",method=RequestMethod.POST)
	public String addStrParam(@PathVariable(value = "str") String str) {
		return "This is added param string with str :"+str;
	}

}
