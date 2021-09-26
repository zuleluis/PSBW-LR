package DataBaseSimulators;

public class Person {
    String ine, name, lastName, address;
    int age;

    public Person(String ine, String name, String lastName, String address, int age) {
        this.ine = ine;
        this.name = name;
        this.address = address;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ine='" + ine + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
