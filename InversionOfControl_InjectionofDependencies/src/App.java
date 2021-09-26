import DataBaseSimulators.Person;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("AL10", "Arturo", "Lopez", "CDMX", 40);
        Person p2 = new Person("PE99", "Pablo", "Escobar", "Cali", 76);
        Person p3 = new Person("CG91", "Chapo", "Guzman", "La Tuna", 56);

        // PersonFactory factory = new PersonFactory(new MariaDbPersons());
        PersonFactory factory = new PersonFactory(new OraclePersons());

        factory.insertPerson(p1);
        factory.insertPerson(p2);
        factory.insertPerson(p3);

        System.out.println(factory.deletePerson(p2));
        factory.showPersons();
    }
}
