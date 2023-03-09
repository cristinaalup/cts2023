package ro.ase.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface ITableGenerator {
    void createTable(Connection connection) throws SQLException;
}
