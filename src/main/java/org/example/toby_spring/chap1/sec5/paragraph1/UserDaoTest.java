package org.example.toby_spring.chap1.sec5.paragraph1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDaoTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = applicationContext.getBean("userDao", UserDao.class);
    }
}
