import org.apache.commons.math4.legacy.linear.SparseRealMatrix;

public class Main {
    public static void main(String[] args) {
        //6) Dada una matriz A, que es la representación de una matriz
        // sparse, generar una matriz M, que es la sparse de la dada.

        int filas = 5, columnas = 5;

        //inicializo el arreglo
        int[][] matrizSparse = new int[filas][columnas];

        //almaceno valores
        matrizSparse[1][2] = 5;
        matrizSparse[0][2] = 4;
        matrizSparse[2][2] = 3;
        matrizSparse[2][0] = 2;
        matrizSparse[4][4] = 9;

        //contador para cantidad num!=0
        int contador = 0;
        //imprimo matriz sparse
        System.out.println("***  MATRIZ SPARSE  ***");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizSparse[i][j] + " ");
                if (matrizSparse[i][j] != 0) {
                    contador++;
                }
            }
            System.out.println();
        }
// Obtener el número de elementos diferentes de cero en la matriz A
        int numNoCero = 0;
        for (int i = 0; i < matrizSparse.length; i++) {
            for (int j = 0; j < matrizSparse[0].length; j++) {
                if (matrizSparse[i][j] != 0) {
                    numNoCero++;
                }
            }
        }

// Crea la matriz B para almacenar los elementos diferentes de cero
        int[][] B = new int[numNoCero][3];

// Recorrer la matriz A y almacenar los elementos diferentes de cero en la matriz B
        int k = 0;
        for (int i = 0; i < matrizSparse.length; i++) {
            for (int j = 0; j < matrizSparse[0].length; j++) {
                if (matrizSparse[i][j] != 0) {
                    B[k][0] = i;  // Almacenar la fila del elemento
                    B[k][1] = j;  // Almacenar la columna del elemento
                    B[k][2] = matrizSparse[i][j];  // Almacenar el valor del elemento
                    k++;
                }
            }
        }
        //imprimo matriz sparse
        System.out.println("***  MATRIZ SPARSE  ***");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

    }
}


