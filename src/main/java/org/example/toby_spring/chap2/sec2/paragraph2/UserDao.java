package org.example.toby_spring.chap2.sec2.paragraph2;

import java.sql.*;

public class UserDao {

    public void add(User user) throws ClassNotFoundException, SQLException {
        System.out.println("=== add ===");
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        System.out.println("=== get ===");
        User user = new User();
        user.setId("gyumee");
        user.setName("박성철"); user.setPassword("springno1");
        return user;
    }

}
