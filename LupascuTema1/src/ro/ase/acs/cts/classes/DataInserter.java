package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.IDataInserter;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataInserter implements IDataInserter {
    public static final String INSERT_DATA_QUERY = "INSERT INTO employees VALUES(1, 'Popescu Ion', 'Bucharest', 4000)";
    @Override
    public void insertData(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(INSERT_DATA_QUERY);
        statement.close();
    }
}
