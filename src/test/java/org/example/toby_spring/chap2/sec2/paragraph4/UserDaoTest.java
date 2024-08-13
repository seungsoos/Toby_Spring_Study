package org.example.toby_spring.chap2.sec2.paragraph4;

import org.example.toby_spring.chap2.sec2.paragraph2.User;
import org.example.toby_spring.chap2.sec2.paragraph2.UserDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * 테스트를 위한 애플리케이션 컨텍스트 관리
 */
@SpringBootTest
class UserDaoTest {

    @Autowired
    private ApplicationContext context;

    private UserDao dao;

    /**
     * @Test 메서드 실행전으로 정의
     */
    @BeforeEach
    public void setUp() {
         this.dao = this.context.getBean("userDao", UserDao.class);
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