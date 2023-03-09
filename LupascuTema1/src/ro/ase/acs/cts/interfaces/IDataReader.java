package ro.ase.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface IDataReader {
    ResultSet readData(Connection connection) throws SQLException;
}
