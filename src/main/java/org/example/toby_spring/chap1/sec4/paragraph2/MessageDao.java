package org.example.toby_spring.chap1.sec4.paragraph2;

public class MessageDao {

    private ConnectionMaker connectionMaker;

    public MessageDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
