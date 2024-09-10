package org.example.toby_spring.chap6.sec1;

import org.springframework.stereotype.Component;

@Component
public class UserServiceTx implements UserService{

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        System.out.println("===== 트랜잭션 분리 로직 시작 =====");
        // 트랜잭션 관련 로직
        userService.add();
        System.out.println("===== 트랜잭션 분리 로직 끝 / 커밋 =====");
    }
}
