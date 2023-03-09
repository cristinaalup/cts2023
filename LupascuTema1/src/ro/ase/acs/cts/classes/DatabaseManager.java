package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.IDatabaseManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager implements IDatabaseManager {
    private static final String DATABASE_URL = "jdbc:sqlite:database.db";
    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL);
    }
}
