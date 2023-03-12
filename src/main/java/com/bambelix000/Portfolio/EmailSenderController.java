package com.bambelix000.Portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailSenderController {

    @Autowired
    private final EmailSenderService senderService;

    public EmailSenderController(EmailSenderService senderService) {
        this.senderService = senderService;
    }

    @PostMapping
    public void sendMail(@ModelAttribute Email email){
        senderService.sendEmail(email);
    }
}
