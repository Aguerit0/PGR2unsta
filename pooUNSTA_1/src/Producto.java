public class Producto implements Comparable<Producto>{
    private String nombre;
    private double litros;
    private double Contenido;
    private double precio;
    private String unidadVenta;
    //CONSTRUCTOR

    public Producto(String nombre, double litros, double contenido, double precio, String unidadVenta) {
        super();
        this.nombre = nombre;
        this.litros = litros;
        Contenido = contenido;
        this.precio = precio;
        this.unidadVenta = unidadVenta;
    }

    //GETTER AND SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getContenido() {
        return Contenido;
    }

    public void setContenido(double contenido) {
        Contenido = contenido;
    }

    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

    @Override
    public int compareTo(Producto o) {
        if (this.getPrecio()<o.getPrecio()){
            return -1;
        } else if (o.getPrecio()<this.getPrecio()) {
            return 1;
        }else {
            return 0;
        }
    }


    public String toString(int valor) {
        if (valor==1){
            return "Producto más barato: " + getNombre();
        }else{
            return "Producto más caro: " + getNombre();
        }


    }

}

