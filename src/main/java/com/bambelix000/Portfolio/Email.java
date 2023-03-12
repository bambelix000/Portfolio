package com.bambelix000.Portfolio;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    String fromEmail;
    String subject;
    String body;
}
