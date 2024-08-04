package org.example.toby_spring.chap1.sec4.paragraph2;

public class AccountDao {

    private ConnectionMaker connectionMaker;

    public AccountDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
