package org.forge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws SQLException {
        Connection c = DriverManager.getConnection(
          "jdbc:sqlserver://localhost:1433;databasename=cine;integratedSecurity=true"
        );
    }
}
