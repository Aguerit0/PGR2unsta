import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Crear objeto de cualquier tipo
-Haces estructura de datos (arraylist o map o alguna otra)
-Ordenar usando comparable y comparator
-Usar método contains con sobreescritura de equals
-(Cargar datos del objeto a mano)
 */
public class P1 {
    //class student
    private static class Student implements Comparable<Student>{
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
        public int compareTo(Student o) {
            return Float.compare(this.average, o.average);
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
    }
    public static void main(String[] args) {
        //create object of student
        Student student1 = new Student();
        Student student2 = new Student();
        Scanner keyboard = new Scanner(System.in);
        //write personal dates to student 1
        System.out.println("*** WRITE PERSONAL DATA OF PERSON 1 ***");
        System.out.print("\nWrite DNI: ");
        student1.dni = keyboard.nextInt();
        keyboard.nextLine(); // Limpiar buffer de teclado
        System.out.print("\nWrite Name: ");
        student1.name = keyboard.nextLine();
        System.out.print("\nWrite LastName: ");
        student1.lastName = keyboard.nextLine();
        System.out.print("\nWrite Average: ");
        student1.average = keyboard.nextFloat();
        keyboard.nextLine(); // Limpiar buffer de teclado

        //write personal dates to student 2
        System.out.println("*** WRITE PERSONAL DATA OF PERSON 2 ***");
        System.out.print("\nWrite DNI: ");
        student2.dni = keyboard.nextInt();
        keyboard.nextLine(); // Limpiar buffer de teclado
        System.out.print("\nWrite Name: ");
        student2.name = keyboard.nextLine();
        System.out.print("\nWrite LastName: ");
        student2.lastName = keyboard.nextLine();
        System.out.print("\nWrite Average: ");
        student2.average = keyboard.nextFloat();
        keyboard.nextLine(); // Limpiar buffer de teclado

        //create arraylist
        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);

        //show list
        System.out.println(list);

        //show compare student1 to student2 average
        if (student1.compareTo(student2)==0){
            System.out.println("student 1 average is equals student 2");
        }else{
            System.out.println("not equals");
        }

        //reverse before
        if (student2.compareTo(student1)==0){
            System.out.println("student 2 average is equals student 1");
        }else{
            System.out.println("not equals");
        }
    }

}