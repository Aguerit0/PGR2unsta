package clases;
//Generar  20 números aleatorios en el rango 20 a 40.
// Determinar cual es el mayor de esos números, el menor y
// promedio de todos los números.
import java.util.Random;

import java.util.Random;

public class NumerosAleatorios {
    private int[] numeros;

    public NumerosAleatorios(int cantidadNumeros, int rangoMinimo, int rangoMaximo) {
        numeros = new int[cantidadNumeros];
        Random rand = new Random();

        for (int i = 0; i < cantidadNumeros; i++) {
            numeros[i] = rand.nextInt(rangoMaximo - rangoMinimo + 1) + rangoMinimo;
        }
    }

    public int[] obtenerNumeros() {
        return numeros;
    }

    public int obtenerMayor() {
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    public int obtenerMenor() {
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }

    public double obtenerPromedio() {
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return suma / numeros.length;
    }
        public static void main(String[] args) {
            NumerosAleatorios numeros = new NumerosAleatorios(20, 20, 40);

            int[] arregloNumeros = numeros.obtenerNumeros();

            System.out.println("Los números generados son: ");
            for (int i = 0; i < arregloNumeros.length; i++) {
                System.out.print(arregloNumeros[i] + " ");
            }
            System.out.println();

            int mayor = numeros.obtenerMayor();
            int menor = numeros.obtenerMenor();
            double promedio = numeros.obtenerPromedio();

            System.out.println("El mayor número generado es: " + mayor);
            System.out.println("El menor número generado es: " + menor);
            System.out.println("El promedio de los números generados es: " + promedio);
        }
}
