package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.ITableGenerator;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TableGenerator implements ITableGenerator {
    public static final String DROP_TABLE_QUERY = "DROP TABLE IF EXISTS employees";
    public static final String CREATE_TABLE_QUERY = "CREATE TABLE employees(id INTEGER PRIMARY KEY,"
            + "name TEXT, address TEXT, salary REAL)";

    @Override
    public void createTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(DROP_TABLE_QUERY);
        statement.executeUpdate(CREATE_TABLE_QUERY);
        statement.close();
    }
}
