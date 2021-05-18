package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.serviec.Emailservice;

@RestController
public class EmailController {
	@Autowired
     private Emailservice service;
	
	@GetMapping("/send")
	public String sendMail()
	{
		//return this.service.sendMailSt();
		return this.service.sendToAttachment();
	}
	
}
