import DataBaseSimulators.Person;

public class PersonFactory {
    IPerson person;

    public PersonFactory(IPerson person) {
        this.person = person;
    }

    public void insertPerson(Person p) {
        person.insertPerson(p);
    }

    public boolean deletePerson(Person p) {
        return person.deletePerson(p);
    }

    public void showPersons() {
        person.showPersons();
    }
}


