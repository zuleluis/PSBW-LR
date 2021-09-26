import DataBaseSimulators.MariaDbSimulator;
import DataBaseSimulators.Person;

public class MariaDbPersons implements IPerson {
    @Override
    public void insertPerson(Person p) {
        MariaDbSimulator.personTable.add(p);
    }

    @Override
    public boolean deletePerson(Person p) {
        if (MariaDbSimulator.personTable.contains(p)) {
            MariaDbSimulator.personTable.remove(p);
            return true;
        }
        return false;
    }

    @Override
    public void showPersons() {
        for (Person p: MariaDbSimulator.personTable) {
            System.out.println(p);
        }
    }
}

