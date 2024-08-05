package org.example.toby_spring.chap1.sec6.paragraph2;

import java.sql.Connection;

/**
 * 싱글톤 레지스트리와 오브젝트 스코프
 *
 * 싱글톤과 오브젝트의 상태
 */
public class UserDao {

    // 초기에 설정하면 사용중에는 바뀌지 않는 읽기전용 인스턴스 변수
    private ConnectionMaker connectionMaker;

    // 매번 새로운 값으로 바뀌는 정보를 담은 인스턴스 변수 / 심각한 문제!!
    private Connection connection;
    private User user;

    /**
     * 클래스의 인스턴스 피리드로 선언 사용시 멀티스레드 환경에서 심각한 문제 발생
     */
}
