package org.example.toby_spring.chap1.sec3.paragraph3;

public class UserDaoTest {

    public static void main(String[] args) {
        DConnectionMaker dConnectionMaker = new DConnectionMaker();

        // UserDao가 사용할 ConnectMaker 구현 클래스를 결정하고 오브젝트를 만든다.
        UserDao userDao = new UserDao(dConnectionMaker);

    }
}
