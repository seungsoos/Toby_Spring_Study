package org.example.toby_spring.chap2.sec2.paragraph3;

import org.example.toby_spring.chap2.sec2.paragraph2.DaoFactory;
import org.example.toby_spring.chap2.sec2.paragraph2.User;
import org.example.toby_spring.chap2.sec2.paragraph2.UserDao;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * 테스트 코드 개선
 */
@SpringBootTest
class UserDaoTest {

    private UserDao dao;

    /**
     * @Test 메서드 실행전으로 정의
     */
    @BeforeEach
    public void setUp() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(DaoFactory.class);
         this.dao = ac.getBean("userDao", UserDao.class);
    }

    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        System.out.println("dao = " + dao);
        User user = new User();
        user.setId("gyumee");
        user.setName("박성철");
        user.setPassword("springno1");
        dao.add(user);

        User user2 = dao.get(user.getId());

        assertThat(user2.getName()).isEqualTo(user.getName());
        assertThat(user2.getPassword()).isEqualTo(user.getPassword());
    }

    @Test
    public void test() {
        System.out.println("dao = " + dao);
    }


}