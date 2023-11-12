package com.deep.SubscribeUs;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendmail(String to) throws Exception {
		
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage , true);
		
		String from= "DS-KART";
		
		String Subject= "Thank you";
		
		String content= "Thank You For Subscribing Us!😊";
		
		helper.setFrom(from);
		helper.setTo(to);
		helper.setSubject(Subject);
		helper.setText(content);
		
		javaMailSender.send(mimeMessage);

	}

}
