import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escribir un algoritmo que imprima “-1 “ si A < B, “1” si A > B y “ 0 “si A = B.

        //creo 2 listas
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();

        //creo objeto random
        Random random = new Random();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la lista A: ");
        int n = teclado.nextInt();
        System.out.println("Ingrese el tamaño de la lista B: ");
        int m = teclado.nextInt();
        int i=0, j=0;

        //llenamos lista A
        while (i<n){
            char caracterAleatorioA = (char) (random.nextInt(26)+'a');
            A.add(String.valueOf(caracterAleatorioA));
            i++;
        }
        //llenamos lista B
        while (j<m){
            char caracterAleatorioB = (char) (random.nextInt(26)+'a');
            B.add(String.valueOf(caracterAleatorioB));
            j++;
        }
        System.out.println("\n\n\n");
        System.out.println("Lista A: "+A);
        System.out.println("Lista B: "+B);

        if (A.size()<B.size()){
            System.out.println("\n***** -1 *****");
        }else if(A.size()>B.size()){
            System.out.println("\n***** 1 *****");
        }else{
            System.out.println("\n***** 0 *****");
        }
    }
}