package org.example.toby_spring.chap3.sec2.paragraph2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface StatementStrategy {

    PreparedStatement makePreparedStatement(Connection c) throws SQLException;
}
