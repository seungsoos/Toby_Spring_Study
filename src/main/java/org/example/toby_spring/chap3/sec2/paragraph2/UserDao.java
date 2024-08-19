package org.example.toby_spring.chap3.sec2.paragraph2;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    private DataSource dataSource;
    public void add(User user) throws ClassNotFoundException, SQLException {
        System.out.println("=== add ===");
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        System.out.println("=== get ===");
        User user = new User();
        user.setId("gyumee");
        user.setName("박성철"); user.setPassword("springno1");
        return user;
    }


    /**
     * 분리와 재사용을 위한 디자인 패턴 적용
     */
    public void deleteAll() throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = dataSource.getConnection();

            /**
             * 변하는 부분을 메소드로 추출하고 변하지 않는 부분에서 호출하도록
             *
             * 하지만 메소드 추출은 다른곳에서 재사용할수 있어야하는데 반대로 되었다.
             */
//            ps = makeStatement(c);


            /**
             * 전략 패턴
             * 구현클래스를 고정한 CASE
             */
            StatementStrategy strategy = new DeleteAllStatement();
            ps = strategy.makePreparedStatement(c);

            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            if (ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if (c != null){
                try {
                    c.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    private PreparedStatement makeStatement(Connection c) throws SQLException {
        return c.prepareStatement("delete from users");
    }


    /**
     * DI를 활용한 전략 패턴
     */
    public void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = dataSource.getConnection();
            ps = stmt.makePreparedStatement(c);

            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            if (ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if (c != null){
                try {
                    c.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}
