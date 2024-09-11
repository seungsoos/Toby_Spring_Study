package org.example.toby_spring.chap6.sec1;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    private MailSender mailSender;
    private UserDao userDao;

    public UserServiceImpl(MailSender mailSender, UserDao userDao) {
        this.mailSender = mailSender;
        this.userDao = userDao;
    }

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void add() {
        System.out.println("===== 비지니스 로직 시작 =====");
        userDao.add();
        mailSender.send();
        System.out.println("===== 비지니스 로직 끝 =====");
    }

}
