import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int filas = 5, columnas = 5;

        //num random
        Random rand = new Random();
        boolean estado=false;
        //inicializo el arreglo
        int[][] matrizSparse = new int[filas][columnas];
        int[][] matrizSparse2 = new int[filas][columnas];
        int[][] C = new int[filas][columnas];

        //almaceno valores
        matrizSparse[1][2] = 5;
        matrizSparse[0][2] = 4;
        matrizSparse[2][2] = 3;
        matrizSparse[2][0] = 2;
        matrizSparse[4][4] = 9;
        matrizSparse2[2][2] = 30;
        matrizSparse2[1][2] = 40;
        matrizSparse2[3][2] = 1;
        matrizSparse2[4][0] = 41;
        matrizSparse2[0][4] = 6;

        //mostrar matriz1
        System.out.println("***  MATRIZ 1  ***");
        for (int i=0; i<matrizSparse.length; i++){
            for (int j=0; j<matrizSparse[i].length; j++){
                System.out.print(matrizSparse[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //mostrar matriz2
        System.out.println("***  MATRIZ 2  ***");
        for (int i=0; i<matrizSparse2.length; i++){
            for (int j=0; j<matrizSparse2[i].length; j++){
                System.out.print(matrizSparse2[i][j]+" ");
            }
            System.out.println();
        }

        //suma de matrices
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                C[i][j] = matrizSparse[i][j]+matrizSparse2[i][j];
            }
        }

        //mostrar matriz1 + matriz 2
        System.out.println("\n\n***  MATRIZ1 + MATRIZ 2  ***");
        for (int i=0; i<C.length; i++){
            for (int j=0; j<C[i].length; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}