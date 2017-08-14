package com.nishant.spring.eureka.consumer.consumerforeurekademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	
	@Autowired
	private ProducerClient producerClient;
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public String showRecievedStr() {
		return producerClient.getString();
	}
	@RequestMapping(value="/getbystr/{str}",method=RequestMethod.GET)
	public String showRecievedStrParam(@PathVariable String str) {
		return producerClient.getStrParam(str);
	}
	@RequestMapping(value="/addbystr/{str}",method=RequestMethod.POST)
	public String showAddedStrParam(@PathVariable String str) {
		return producerClient.addStrParam(str);
	}

}
