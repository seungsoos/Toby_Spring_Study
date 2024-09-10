package org.example.toby_spring.chap5.sec4.paragraph1;

import org.springframework.stereotype.Component;

//@Component
public class MailSenderImpl implements MailSender{
    @Override
    public void send() {
        System.out.println("====== Mail Send =====");
    }
}
