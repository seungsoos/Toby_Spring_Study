package org.example.toby_spring.chap3.sec4.paragraph1;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * UserDao 와 JdbcContext 간의
 * 인터페이스를 사용하지 않고 DI를 적용
 */
@Component
public class UserDao {

    private JdbcContext jdbcContext;

    public void setJdbcContext(JdbcContext jdbcContext) {
        this.jdbcContext = jdbcContext;
    }

    public void add(User user) throws ClassNotFoundException, SQLException {
        this.jdbcContext.workWithStatementStrategy(new StatementStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection c) throws SQLException {
                return null;
            }
        });
    }

}
