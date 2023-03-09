package ro.ase.acs.cts.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IConsoleWriter {
    void displayResultSet(ResultSet resultSet) throws SQLException;
}
