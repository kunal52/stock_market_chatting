package com.cts.stockmarketcharting;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class WebConfig {

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	@Bean
    public JavaMailSenderImpl  mailSender() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost("");
        javaMailSender.setProtocol("smtp");
        javaMailSender.setPort(587);
        javaMailSender.setUsername("");
        javaMailSender.setPassword("");
        return javaMailSender;
    }
}
