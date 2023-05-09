import clases.AreaCirculo;
import clases.Operadores;
import clases.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1 - area de un circulo\n2 - operadores\n3 - persona\n0 - salir");
        int x = teclado.nextInt();
        while (x!=0){
            if (x==1){
                //area de un circulo
                Scanner tecladoDouble = new Scanner(System.in);
                System.out.println("***  CALCULAR AREA DE UN CIRCULO  ***");
                System.out.print("Ingrese el radio: ");
                double radio = tecladoDouble.nextDouble();
                AreaCirculo areaCirculo = new AreaCirculo(radio);
                System.out.print("\nEl área es: "+areaCirculo.areaCirculo());
                x=0;
            }else if(x==2){
                //utilizar todos los operadores de java o hacer calculadora
                Scanner tecladoDouble = new Scanner(System.in);
                System.out.println("***  OPERADORES  ***");
                System.out.print("Ingrese el primer numero: ");
                double num1 = tecladoDouble.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                double num2 = tecladoDouble.nextDouble();
                Operadores operadores = new Operadores(num1,num2);
                System.out.println("suma: "+operadores.sumaEnteros()+"\nresta: "+operadores.restaEnteros()+"\nmultiplicacion: "+operadores.multiplicacionEnteros()+"\ndivision: "+operadores.divisionEnteros()+"\nresto: "+operadores.modEnteros()+"\nraiz: "+operadores.raizEnteros()+"\npotencia: "+operadores.potenciaEnteros()+"\nand: "+operadores.andEnteros()+"\nor: "+operadores.orEnteros());
                x=0;

            }else if (x==3){
                //clase persona, retorna mayor o menor de edad
                Scanner tecladoString = new Scanner(System.in);
                System.out.println("***  PERSONA  ***");
                System.out.println("Ingrese nombre: ");
                String nombre = tecladoString.nextLine();
                System.out.println("Ingrese apellido: ");
                String apellido = tecladoString.nextLine();
                System.out.println("Ingrese edad: ");
                Scanner tecladoInt = new Scanner(System.in);
                int edad = tecladoInt.nextInt();
                Persona persona = new Persona(nombre,apellido,edad);
                System.out.println(persona.toString());
                x=0;
            }else{
                break;
            }
        }

    }
}