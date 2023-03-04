package com.bambelix000.Portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private final JavaMailSender sender;

    public EmailSenderService(JavaMailSender sender) {
        this.sender = sender;
    }


    public void sendEmail(Email email){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(email.getFromEmail());
        message.setTo("bartekbaamb@gmail.com");
        message.setText(email.getBody());
        message.setSubject(email.getSubject());

        sender.send(message);

    }
}
