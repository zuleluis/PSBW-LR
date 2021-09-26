import DataBaseSimulators.Person;

public interface IPerson {
    public void insertPerson(Person p);

    public boolean deletePerson(Person p);

    public void showPersons();
}
