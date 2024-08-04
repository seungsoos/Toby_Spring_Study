package org.example.toby_spring.chap1.sec2.paragraph3;

import java.sql.Connection;
import java.sql.SQLException;

public class DUserDao extends UserDao{
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        System.out.println("D사 DB Connection 생성 코드");
        return null;
    }
}
