import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Ingrese el tamaño de la matriz A: ");
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoString = new Scanner(System.in);
        int n = teclado.nextInt();
        System.out.println("Ingrese el tamaño de la matriz B: ");
        int m = teclado.nextInt();
        String A[][] = new String[n][3];
        String B[][] = new String[m][3];
        for (int i=0; i<n; i++){
            System.out.println("*** EMPLEADOS DE LA UNIVERSIDAD ***");
            System.out.println("\n*** EMPLEADO "+(i+1)+" *** ");
            System.out.println("Nombre: ");
            String nombre = tecladoString.nextLine();
            System.out.println("Apellido: ");
            String apellido = tecladoString.nextLine();
            System.out.println("Sueldo: ");
            String sueldo = tecladoString.nextLine();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        for (int i=0; i<m; i++){
            System.out.println("*** ALUMNOS DE LA UNIVERSIDAD ***");
            System.out.println("\n*** ALUMNO "+(i+1)+" *** ");
            System.out.println("Nombre: ");
            String nombre = tecladoString.nextLine();
            System.out.println("Apellido: ");
            String apellido = tecladoString.nextLine();
            System.out.println("Promedio: ");
            String promedio = tecladoString.nextLine();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        System.out.println("\n");
//        //muestro matrices originales
//        for (int i=0; i<A.length; i++){
//            System.out.println("*** EMPLEADO "+(i+1)+" ***");
//            for (int j=0; j<A[i].length; j++){
//                System.out.println(A[i][j] +" ");
//            }
//        }
//        //muestro matrices originales
//        for (int i=0; i<B.length; i++){
//            System.out.println("*** Alumno "+(i+1)+" ***");
//            for (int j=0; j<B[i].length; j++){
//                System.out.println(B[i][j] +" ");
//            }
//        }
        //busco elementos iguales y aumento sueldo
        boolean sueldoAumentado = false;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] != null) { // verifica que A[i][j] no sea null
                    for (int k = 0; k < B.length; k++) {
                        for (int l = 0; l < B[k].length; l++) {
                            if (B[k][l] != null && A[i][j].equals(B[k][l])) { // verifica que B[k][l] no sea null
                                String sueldo = A[i][2];
                                float sueldoFloat = (Float.parseFloat(sueldo));
                                sueldoFloat = sueldoFloat + (sueldoFloat * 0.1f);
                                A[i][2] = Float.toString(sueldoFloat);
                                sueldoAumentado = true;
                                System.out.println("Se aumento el sueldo a: "+A[i][0]+" "+ A[i][1]);
                                System.out.println("Sueldo anterior: "+sueldo);
                                System.out.println("Sueldo nuevo: "+A[i][2]);
                            }
                        }
                    }
                }
            }
        }



    }
}