package clases;

public class Auto {
    private String modelo;
    private String marca;
    private int anio;
    private int cilindrada;
    private int velocidadMaxima;
    private int km;
    private double consumoPromedio;
    private String color;

    public Auto(String modelo, String marca, int anio, int cilindrada, int velocidadMaxima, int km, double consumoPromedio, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.cilindrada = cilindrada;
        this.velocidadMaxima = velocidadMaxima;
        this.km = km;
        this.consumoPromedio = consumoPromedio;
        this.color = color;
    }

    public void acelerar(int velocidad) {
        if (velocidad > velocidadMaxima) {
            System.out.println("Velocidad supera el límite máximo: " + velocidadMaxima + " km/h");
        } else {
            System.out.println("Acelerando a " + velocidad + " km/h");
        }
    }

    public void viajar(int km) {
        this.km += km;
        double consumo = km * consumoPromedio / 100;
        System.out.println("Recorriendo " + km + " km, consumo total: " + consumo + " litros");
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int getKm() {
        return km;
    }

    public double getConsumoPromedio() {
        return consumoPromedio;
    }

    public String getColor() {
        return color;
    }
        public static void main(String[] args) {
            Auto miAuto = new Auto("Focus", "Ford", 2019, 1600, 180, 25000, 8.5, "Rojo");

            System.out.println("Modelo: " + miAuto.getModelo());
            System.out.println("Marca: " + miAuto.getMarca());
            System.out.println("Año: " + miAuto.getAnio());
            System.out.println("Cilindrada: " + miAuto.getCilindrada() + " cc");
            System.out.println("Velocidad máxima: " + miAuto.getVelocidadMaxima() + " km/h");
            System.out.println("Kilómetros recorridos: " + miAuto.getKm() + " km");
            System.out.println("Consumo promedio: " + miAuto.getConsumoPromedio() + " litros/100 km");
            System.out.println("Color: " + miAuto.getColor());

            miAuto.acelerar(150);
            miAuto.viajar(100);
        }
    }
