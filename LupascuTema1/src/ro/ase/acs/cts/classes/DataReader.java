package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.IDataReader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataReader implements IDataReader {
    private static final String SELECT_DATA_QUERY = "SELECT * FROM employees";

    @Override
    public ResultSet readData(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(SELECT_DATA_QUERY);
    }
}
