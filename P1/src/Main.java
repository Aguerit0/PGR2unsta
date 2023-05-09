import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Coca-Cola Zero", 1.5, 0, 20, "");
        Producto producto2 = new Producto("Coca-Cola", 1.5, 0, 18, "");
        Producto producto3 = new Producto("Shampoo Sedal", 0, 500, 19, "");
        Producto producto4 = new Producto("Frutillas", 0, 0, 64, "kilo");
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);

        Collections.sort(listaProductos);


        System.out.println(listaProductos.get(0).toString(1));
        System.out.println(listaProductos.get(listaProductos.size() - 1).toString(0));

    }
}
