import java.util.Comparator;

public class Student  implements Comparable<Student>, Comparator<Student> {
    int dni;
    float average;
    String name, lastName;

    //constructor empty
    public Student() {
    }

    //constructor
    public Student(int dni, float average, String name, String lastName) {
        this.dni = dni;
        this.average = average;
        this.name = name;
        this.lastName = lastName;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "dni=" + dni +
                ", average=" + average +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        int estado = -1;
        if (this.getDni() == o.getDni()) {
            estado = 0;
        } else {
            estado = -1;
        }
        return estado;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getLastName().equals(o2)) {
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
