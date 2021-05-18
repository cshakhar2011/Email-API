package com.nt.serviec;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class Emailservice {

	@Autowired
	private JavaMailSender javaMailSender;

//	public String sendMailSt() {
//
//		try {
//			Email mail = new SimpleEmail();
//			//SimpleMailMessage mailMessage = new SimpleMailMessage();
//			mailMessage.setFrom("c.shakhar2011@gmail.com");
//			mailMessage.setTo("c.shekharsing1993@gmail.com");
//			mailMessage.setText("This is my First Mail ");
//			mailMessage.setSubject("First Maial Service");
//			javaMailSender.send(mailMessage);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "Mail send...";
//	}
//	
	public String sendToAttachment()
	{
		MimeMessage message=javaMailSender.createMimeMessage();
		
		try {
		MimeMessageHelper helper=new MimeMessageHelper(message,true);
		helper.setFrom("c.shakhar2011@gmail.com");
		helper.setTo("c.shekharsingh1993@gmail.com");
		helper.setText("This is my first mail ");
		helper.setSubject("Mail Serviec");
		
		//FileSystemResource fileSystemResource=new FileSystemResource(new File(attachment));
		//helper.addAttachment(fileSystemResource.getFilename(),fileSystemResource);
		javaMailSender.send(message);
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "Mail send...";
	}

}
