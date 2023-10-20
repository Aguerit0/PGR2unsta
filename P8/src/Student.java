public class Student extends Person {
    private String tuition;
    private boolean regular;

    public Student() {
    }

    public Student(String name, String lastname, String age, int dni, String tuition, boolean regular) {
        super(name, lastname, age, dni);
        this.tuition = tuition;
        this.regular = regular;
    }
    public Student(Person person, String tuition, boolean regular){
        super(person.name, person.lastname, person.age, person.dni);
        this.tuition = tuition;
        this.regular = regular;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    @Override
    public String toString() {
        return "Student{" +
                "tuition='" + tuition + '\'' +
                ", regular=" + regular +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age='" + age + '\'' +
                ", dni=" + dni +
                '}';
    }
}
