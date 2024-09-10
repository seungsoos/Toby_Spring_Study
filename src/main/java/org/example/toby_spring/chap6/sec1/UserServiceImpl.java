package org.example.toby_spring.chap6.sec1;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    private MailSender mailSender;

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void add() {
        System.out.println("===== 비지니스 로직 시작 =====");
        mailSender.send();
        System.out.println("===== 비지니스 로직 끝 =====");
    }

}
