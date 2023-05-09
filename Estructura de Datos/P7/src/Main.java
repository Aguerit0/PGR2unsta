import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int filas = 5, columnas = 5;

        //num random
        Random rand = new Random();
        boolean estado=false;
        //inicializo el arreglo
        int[][] matrizSparse = new int[filas][columnas];

        //agregar valores aleatorios diferentes a la matriz
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                while (estado==false){
                    int num = rand.nextInt(101);
                    for (int k=0; k<filas; k++){
                        for (int l=0; l<columnas; l++){
                            if (matrizSparse[i][j]==num){
                                estado = false;
                            }else{
                                estado = true;
                            }
                        }
                    }
                    matrizSparse[i][j] = num;
                }
                estado=false;
            }
        }

        //mostrar matriz
        for (int i=0; i<matrizSparse.length; i++){
            for (int j=0; j<matrizSparse[i].length; j++){
                System.out.print(matrizSparse[i][j]+" ");
            }
            System.out.println();
        }

        //encontrar punto silla
        int fila = -1, columna = -1;
        for (int i=0; i<filas; i++){
            int minimo = matrizSparse[i][0];
            int columnaMinimo = 0;
            for (int j=0; j<columnas; j++){
                if (matrizSparse[i][j] < minimo){
                    minimo = matrizSparse[i][j];
                    columnaMinimo = j;
                }
            }
            boolean puntoSilla = true;
            for (int k=0; k<filas; k++){
                if (matrizSparse[k][columnaMinimo] > minimo){
                    puntoSilla = false;
                    break;
                }
            }
            if (puntoSilla){
                fila = i;
                columna = columnaMinimo;
                break;
            }
        }

        if (fila == -1 || columna == -1){
            System.out.println("No se encontró punto silla en la matriz");
        }else{
            System.out.println("El punto silla se encuentra en la fila " + fila + " y columna " + columna + " con valor " + matrizSparse[fila][columna]);
        }


    }
}