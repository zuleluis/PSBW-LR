import DataBaseSimulators.OracleDataBaseSimulator;
import DataBaseSimulators.Person;

public class OraclePersons implements IPerson {

    @Override
    public void insertPerson(Person p) {
        OracleDataBaseSimulator.personTable.add(p);
    }

    @Override
    public boolean deletePerson(Person p) {
        if (OracleDataBaseSimulator.personTable.contains(p)) {
            OracleDataBaseSimulator.personTable.remove(p);
            return true;
        }
        return false;
    }

    @Override
    public void showPersons() {
        for (Person p: OracleDataBaseSimulator.personTable) {
            System.out.println(p);
        }
    }
}

