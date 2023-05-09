import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de polinomios");
        Scanner teclado = new Scanner(System.in);
        int m = teclado.nextInt();

        //almaceno en dos arreglos
        int[] exponentes = new int[m];
        float[] coeficientes = new float[m];

        //agrgear valores a los arreglos
        for (int i=0; i<m; i++){
            System.out.println("Exponente en ["+(i+1)+"]");
            exponentes[i] = teclado.nextInt();
            System.out.println("Coeficiente en ["+(i+1)+"]");
            coeficientes[i] = teclado.nextFloat();
        }
        System.out.println("Ingresar un valor para Xo: ");
        float Xo = teclado.nextFloat();

        //evaluo el polinomio
        float resultado = 0;
        for (int i=0; i<m; i++){
            resultado+= coeficientes[i] * Math.pow(Xo, exponentes[i]);
        }
        System.out.println("\n\nEl resultado para evaluar en Xo="+Xo+" es: "+resultado);
        //PARA DERIVAR UN POLINOMIO SE UTILIZA: polinomio.Math.derivate
    }
}