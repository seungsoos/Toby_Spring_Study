package org.example.toby_spring.chap1.sec3.paragraph3;

import java.sql.Connection;

public class NConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() {
        System.out.println("N사 Connection");
        return null;
    }
}
