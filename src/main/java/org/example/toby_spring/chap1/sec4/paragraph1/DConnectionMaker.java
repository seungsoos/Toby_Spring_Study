package org.example.toby_spring.chap1.sec4.paragraph1;

import java.sql.Connection;

public class DConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() {
        System.out.println("D사 Connection");
        return null;
    }
}
