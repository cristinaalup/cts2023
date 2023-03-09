package ro.ase.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface IDatabaseManager {
    Connection getConnection() throws SQLException;
}
