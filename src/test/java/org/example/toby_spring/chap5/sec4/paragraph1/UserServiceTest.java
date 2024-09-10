package org.example.toby_spring.chap5.sec4.paragraph1;

import org.junit.jupiter.api.Test;

class UserServiceTest {

    /**
     * interface 활용하여
     * 테스트를 위한 더미 DI
     */
    @Test
    public void sendTest() {
        UserService userService = new UserService(new DummyMailSender());
        userService.send();
    }

}