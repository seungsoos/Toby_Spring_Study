package org.example.toby_spring.chap5.sec4.paragraph1;

public class DummyMailSender implements MailSender{
    @Override
    public void send() {
        System.out.println("기능없음.");
    }
}
