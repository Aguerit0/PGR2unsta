import clases.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1 - sumar dos enteros\n2 - agregar y mostrar persona\n3 - salir");
        int x = teclado.nextInt();
        while (x!=0){
            if (x==1){
                //Sumar 2 Enteros
                System.out.println("***  SUMAR DOS NÚMEROS ENTEROS  ***");
                System.out.print("Ingrese el primer entero: ");
                int num1 = teclado.nextInt();
                System.out.print("\nIngrese el segundo entero: ");
                int num2 = teclado.nextInt();
                clases.SumarEnteros objeto1 = new clases.SumarEnteros(num1, num2);
                System.out.println("\nResultado = "+objeto1.getResultado());
            }else if(x==2){
                //agregar y mostrar persona
                Scanner tecladoString = new Scanner(System.in);
                System.out.println("***  DATOS DE PERSONA  ***");
                System.out.print("Ingrese el nombre: ");
                String nombre = tecladoString.nextLine();
                System.out.print("Ingrese el apellido: ");
                String apellido = tecladoString.nextLine();
                System.out.print("Ingrese la edad: ");
                String edad = tecladoString.nextLine();
                Persona persona = new Persona(nombre, apellido, edad);
                System.out.println("DATOS DE LA PERSONA: "+persona.toString());
                x=0;

            }else{
                break;
            }
        }

    }
}