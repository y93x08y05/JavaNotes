package com.jack.algorithm.设计模式.structure.外观模式;

import java.sql.Connection;
import java.sql.SQLException;

public interface DbConnection {
    public Connection getConnection(Object obj) throws SQLException,ClassNotFoundException;
    public void beginTransaction(Object obj) throws SQLException;
    public void commit(Object obj) throws SQLException;
    public void rollback(Object obj) throws SQLException;
    public void close(Object obj) throws SQLException;
}