import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //1) Dada una lista ordenada L de n elementos, eliminar, si es que se encuentra en L,
    // un elemento x. Si x no existe en L, emitir un mensaje. Si x se encuentra en L, eliminarlo, manteniendo la densidad de la lista.
    //Para señalar que se eliminó un elemento ponga un “*” en L( n ) .
    public static void main(String[] args) {
        //creo una lista
        List<String> elementos = new ArrayList<>();

        //agrego elementos a la lista
        elementos.add("1");
        elementos.add("3");
        elementos.add("5");
        elementos.add("7");
        elementos.add("9");
        elementos.add("12");

        //creo objeto teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Agrega el número que quieres buscar: ");
        String valor = teclado.nextLine();
        String caracter = "*";

        //verifico si el numero se encuenra en la lista
        if (elementos.contains(valor)){
            System.out.println(valor+" SI se encuentra en la lista y fué reemplazado.");
            int indice = elementos.indexOf(valor);
            elementos.set(indice, caracter);
        }else {
            System.out.println(valor+" NO se encuentra en la lista.");
        }

        //muestro la lista
        System.out.println(elementos);


    }
}