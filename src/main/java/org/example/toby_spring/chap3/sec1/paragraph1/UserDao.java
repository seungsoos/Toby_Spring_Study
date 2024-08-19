package org.example.toby_spring.chap3.sec1.paragraph1;

import javax.sql.DataSource;
import java.sql.*;

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
     * 불필요 및 중복 코드
     */
    public void deleteAll() throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = dataSource.getConnection();
            ps = c.prepareStatement("delete from users");
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
