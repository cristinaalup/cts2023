package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Orchestrator {
    private final IDatabaseManager databaseManager;
    private final IConsoleWriter consoleWriter;
    private IDataInserter dataInserter;
    private final IDataReader dataReader;
    private final ITableGenerator tableGenerator;

    public Orchestrator(IDatabaseManager databaseManager, IConsoleWriter consoleWriter, IDataInserter dataInserter,
                        IDataReader dataReader, ITableGenerator tableGenerator) {
        this.databaseManager = databaseManager;
        this.consoleWriter = consoleWriter;
        this.dataInserter = dataInserter;
        this.dataReader = dataReader;
        this.tableGenerator = tableGenerator;
    }

    public void setDataInserter(IDataInserter dataInserter){
        this.dataInserter = dataInserter;
    }

    public void runWorkFlow(){
        try {
            Connection connection= databaseManager.getConnection();
            tableGenerator.createTable(connection);
            dataInserter.insertData(connection);
            ResultSet resultSet=dataReader.readData(connection);
            consoleWriter.displayResultSet(resultSet);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
