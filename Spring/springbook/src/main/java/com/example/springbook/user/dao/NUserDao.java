package com.example.springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDao extends UserDao2 {
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        return null;
    }
}
