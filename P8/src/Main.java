//COMMENTS: CHANGED PARAMS TEACHER AND STUDENT: CONVERT LIST TO OBJECT
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//create nested list to Student, 1List: Student 2List:Subject 3List: Teacher
public class Main {
    public static void main(String[] args)
    {
        //create person student
        Person personStudent1 = new Person("AA", "AA", "25", 129391239);
        Person personStudent2 = new Person("BB", "BB", "18", 95493959);
        //add persons to list
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(personStudent1);listPerson.add(personStudent2);


        //create student
        Student student1 = new Student(personStudent1, "L180028", true);
        Student student2 = new Student(personStudent2, "L180029", false);
        //add student to list
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);listStudent.add(student2);


        //create object to subjects
        Subject subject1 = new Subject("Matematica", 2023, 1);
        Subject subject2 = new Subject("PGR2", 2023, 1);
        //create list subject
        List<Subject> listSubject = new ArrayList<>();
        //add objects into listsubjects
        listSubject.add(subject1);listSubject.add(subject2);


        //create person teacher
        Person personTeacher = new Person("esteban", "agüero", "22", 43192391);
        //create instance object to teacher and add objects/lists
        Teacher teacher = new Teacher(personTeacher, listSubject, listStudent);

        //list anid
        List<List> listNested = new ArrayList<>();
        listNested.add(listPerson);
        listNested.add(listStudent);
        listNested.add(listPerson);


        //show list teacher, students, person, subjects
        System.out.println("PERSONS\n"+listPerson);
        System.out.println("\nSTUDENTS\n"+listStudent);
        System.out.println("\nTEACHERS\n"+teacher);
        System.out.println("\nSUBJECTS\n"+listSubject);
        System.out.println("\nNESTED LIST\n"+listNested);

    }

}