import java.util.List;

public class Teacher extends Person{
    private List<Subject> subjects;
    private List<Student> students;

    public Teacher() {
    }

    public Teacher(String name, String lastname, String age, int dni, List<Subject> subjects, List<Student> students) {
        super(name, lastname, age, dni);
        this.subjects = subjects;
        this.students = students;
    }
    public Teacher(Person person, List<Subject> subjects, List<Student> students){
        super(person.name, person.lastname, person.age, person.dni);
        this.subjects = subjects;
        this.students = students;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subjects=" + subjects +
                ", students=" + students +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age='" + age + '\'' +
                ", dni=" + dni +
                '}';
    }
}
