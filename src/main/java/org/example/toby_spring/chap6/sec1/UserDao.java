package org.example.toby_spring.chap6.sec1;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

    public void add() {
        System.out.println("=== add ===");
    }
}
