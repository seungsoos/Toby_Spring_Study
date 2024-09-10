package org.example.toby_spring.chap5.sec4.paragraph1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

//@Component
@RequiredArgsConstructor
public class UserService {

    private final MailSender mailSender;

    public void send() {
        mailSender.send();
    }

}
