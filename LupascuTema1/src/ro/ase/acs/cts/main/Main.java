package ro.ase.acs.cts.main;

import ro.ase.acs.cts.classes.*;


public class Main {

    public static void main(String[] args) {
        Orchestrator orchestrator=new Orchestrator(new DatabaseManager(),new ConsoleWriter(),new DataInserter(),
                new DataReader(),new TableGenerator());
        orchestrator.runWorkFlow();
        orchestrator.setDataInserter(new DataInserterWithParameters());
        orchestrator.runWorkFlow();
    }

}
