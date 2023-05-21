public class Person {
    String name, lastname, age;
    int dni;

    public Person() {
    }

    public Person(String name, String lastname, String age, int dni) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age='" + age + '\'' +
                ", dni=" + dni +
                '}';
    }
}