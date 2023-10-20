import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class Main {
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
        ArrayList<Student> listTemp = new ArrayList<>();
        listTemp = list;
        list.add(student1);
        list.add(student2);

        //show list
        System.out.println(list);

        //show compare student1 to student2 average: compare to DNI
        if (student1.compareTo(student2) == 0) {
            System.out.println("student 1 average is equals student 2");
        } else {
            System.out.println("not equals");
        }

        //reverse before: compare to DNI
        if (student2.compareTo(student1) == 0) {
            System.out.println("student 2 average is equals student 1");
        } else {
            System.out.println("not equals");
        }

        //sort list method collection (sort use interface comparable and use to DNI)
        Collections.sort(list);
        System.out.println("List Sort: \n"+list);
        System.out.println("List not Sort: \n"+listTemp);

        //sort list use other method
        ArrayList<Student> listTempTwo = (ArrayList<Student>) listTemp.stream().sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getName)).collect(Collectors.toList());
        System.out.println(listTempTwo);
    }
}