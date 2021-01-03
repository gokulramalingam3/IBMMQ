package com.jms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	@Autowired
    private JmsTemplate jmsTemplate;
	 
	 @GetMapping("send")
	 String send(){
	     try{
	         jmsTemplate.convertAndSend("Q1", "Hello World!");
	         return "OK";
	     }catch(JmsException ex){
	         ex.printStackTrace();
	         return "FAIL";
	     }
	 }
	 
	 @GetMapping("recv")
	 String recv(){
	     try{
	         return jmsTemplate.receiveAndConvert("Q1").toString();
	     }catch(JmsException ex){
	         ex.printStackTrace();
	         return "FAIL";
	     }
	 }
}
