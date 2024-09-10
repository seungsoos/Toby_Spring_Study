package org.example.toby_spring.chap6.sec1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserServiceImpl userServiceImpl;
    @Test
    void UserServiceTest() {
        userServiceImpl.setMailSender(new DummyMailSender());


        UserServiceTx userServiceTx = new UserServiceTx();
        userServiceTx.setUserService(userServiceImpl);
        userServiceTx.add();
    }



}