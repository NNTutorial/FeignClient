package com.nishant.spring.eureka.consumer.consumerforeurekademo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("producer-eureka-demo")
public interface ProducerClient {

	@RequestMapping(value="/producer/def",method=RequestMethod.GET)
	String getString();
	
	@RequestMapping(value="/producer/param/{str}",method=RequestMethod.GET)
	String getStrParam(@PathVariable(value = "str") String str);
	
	@RequestMapping(value="/producer/add/{str}",method=RequestMethod.POST)
	public String addStrParam(@PathVariable(value = "str") String str);


}
