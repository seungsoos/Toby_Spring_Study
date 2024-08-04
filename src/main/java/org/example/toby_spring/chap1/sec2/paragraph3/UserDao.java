package org.example.toby_spring.chap1.sec2.paragraph3;

import java.sql.*;


/**
 * 관심삼의 분리
 *
 * 상속을 통한 확장
 */
public abstract class UserDao {

    public void add(User user) throws ClassNotFoundException, SQLException {
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(
                "insert into users(id, name, password) values(?,?,1)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.executeUpdate();
        ps.close();
        c.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement("select * from users where id = ?");
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));
        rs.close();
        ps.close();
        c.close();
        return user;
    }

    /**
     * DB Connection 연결 공통 메서드 추출로 중복 제거
     */
    protected abstract Connection getConnection() throws ClassNotFoundException, SQLException;

}
