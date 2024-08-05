package org.example.toby_spring.chap1.sec6.paragraph1;

/**
 * 싱글톤 레지스트리와 오브젝트 스코프
 *
 * 싱굴톤 래지스트리로서의 애플리케이션 컨텍스트
 */
public class UserDao {

    /**
     * 싱글톤 패턴의 문제점
     *
     * 1.private 생성자를 갖고 있기 떄문에 상속할 수 없다.
     * 2.싱글톤은 테스트하기가 힘들다.
     * 3.서버환경에서는 싱글톤이 하나만 만들어지는거시을 보장하지 못한다.
     * 4.싱글톤의 사용은 전역 상태를 만들 수 있기 때문에 바람직하지 못한다.
     */

    private static UserDao INSTANCE;
    private ConnectionMaker connectionMaker;

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public static synchronized UserDao getlnstance() {
        //
//        if (INSTANCE == null) INSTANCE = new UserDao(); return INSTANCE;
        return INSTANCE;
    }

}
