package com.seleniumexpress.lc.service;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;
import com.seleniumexpress.lc.api.EmailDTO;
import com.seleniumexpress.lc.config.EmailConfig;

@Service

public class EmailNotification {
	
	@Autowired
	private EmailConfig emailConfig;
	
	
	public void sendEmail(EmailDTO dto) throws Exception {
		
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
	
		
		simpleMailMessage.setTo(dto.getUserEmail());
        simpleMailMessage.setSubject("Your Love Calculation Result");
        simpleMailMessage.setText("The love calculator predicts : " + "Frind hardcoded");
        
        System.out.println("Email essentials got set..");
         
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        System.out.println("java mail sender object created..");
        sender.setHost(this.emailConfig.getHost());
        sender.setPassword(this.emailConfig.getPassword());
        sender.setUsername(this.emailConfig.getUserName());
        sender.setPort(this.emailConfig.getPort());
        
        //this property is important to set
        Properties javaMailProperties = new Properties();
        javaMailProperties.put("mail.smtp.starttls.enable", true);
        javaMailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		sender.setJavaMailProperties(javaMailProperties);
		
		System.out.println("reciver information got set..");
        
		try {
        sender.send(simpleMailMessage);
        
        System.out.println("Sent !!");
		}catch(Exception e){
			
			throw new Exception("Email sending failed");
		}
		
	}

}
