package org.example.toby_spring.chap6.sec1;

public class DummyMailSender implements MailSender {
    @Override
    public void send() {
        System.out.println("===== 더미 메일 샌드 시작 =====");
        System.out.println("===== 더미 메일 샌드 끝 =====");
    }
}
