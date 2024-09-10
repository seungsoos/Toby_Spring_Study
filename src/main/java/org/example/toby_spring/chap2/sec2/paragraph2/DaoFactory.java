package org.example.toby_spring.chap2.sec2.paragraph2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

//    @Bean
    public UserDao userDao() {
        // 팩토리의 메서드는 UserDao 타입의 오브젝트를 어떻게 만들고, 어떻게 준비시킬지 결정
        UserDao userDao = new UserDao();
        return userDao;
    }
}
