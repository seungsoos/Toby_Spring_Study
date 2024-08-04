package org.example.toby_spring.chap1.sec4.paragraph2;


public class DaoFactory {

    //ConnectionMaker 구현 클래스를 선정하고 생성하는 코드의 중복 발생
    public UserDao userDao() {
//        ConnectionMaker dConnectionMaker = new DConnectionMaker();
//        UserDao userDao = new UserDao(dConnectionMaker);
        UserDao userDao = new UserDao(connectionMaker());
        return userDao;
    }

    public AccountDao accountDao() {
//        ConnectionMaker dConnectionMaker = new DConnectionMaker();
//        AccountDao accountDao = new AccountDao(dConnectionMaker);
        AccountDao accountDao = new AccountDao(connectionMaker());
        return accountDao;
    }

    public MessageDao messageDao() {
//        ConnectionMaker dConnectionMaker = new DConnectionMaker();
//        MessageDao messageDao = new MessageDao(dConnectionMaker);
        MessageDao messageDao = new MessageDao(connectionMaker());
        return messageDao;
    }

    public ConnectionMaker connectionMaker() {
        // 분리해서 중복을 제거한 ConnectionMaker 타입오브젝트생성코드
        return new DConnectionMaker();
    }
}
