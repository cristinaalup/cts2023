package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.IConsoleWriter;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsoleWriter implements IConsoleWriter {
    @Override
    public void displayResultSet(ResultSet resultSet) throws SQLException {
        String format = "id: %d, name: %s, address: %s, salary: %.2f%n";
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String address = resultSet.getString("address");
            double salary = resultSet.getDouble("salary");
            System.out.printf(format, id, name, address, salary);
        }
        resultSet.close();
    }
}
