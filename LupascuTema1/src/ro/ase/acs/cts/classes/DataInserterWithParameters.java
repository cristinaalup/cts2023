package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.IDataInserter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataInserterWithParameters implements IDataInserter {
    public static final String INSERT_DATA_QUERY_WITH_PARAMETERS = "INSERT INTO employees VALUES (?,?,?,?)";
    @Override
    public void insertData(Connection connection) throws SQLException {
        PreparedStatement preparedStatement =
                connection.prepareStatement(INSERT_DATA_QUERY_WITH_PARAMETERS);
        preparedStatement.setInt(1, 2);
        preparedStatement.setString(2, "Ionescu Vasile");
        preparedStatement.setString(3, "Brasov");
        preparedStatement.setDouble(4, 4500);
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }
}
