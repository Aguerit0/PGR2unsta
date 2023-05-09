package clases;

import java.util.Scanner;

public class Cuenta {
    private String nombreBanco;
    private double[] numeroCuenta;
    private String[] nombreCliente;
    private double[] saldo;
    private double[] dni;

    public Cuenta() {
        nombreBanco = "BRUBANK";
        numeroCuenta = new double[]{12345, 112312324, 112312325};
        saldo = new double[]{10000, 23000, 19000};
        dni = new double[]{1, 2, 3};
        nombreCliente = new String[]{"esteban", "matias", "micaela"};
    }

    public Cuenta(String nombreBanco, String[] nombreCliente, double[] numeroCuenta, double[] saldo, double[] dni) {
        this.nombreBanco = nombreBanco;
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.dni = dni;
    }

    private boolean validarCliente(double dni, String nombreCliente) {
        for (int i = 0; i < this.dni.length; i++) {
            if (dni == this.dni[i] && nombreCliente.equals(this.nombreCliente[i])) {
                return true;
            }
        }
        return false;
    }

    private int obtenerPosicionCliente(double dni, String nombreCliente) {
        for (int i = 0; i < this.dni.length; i++) {
            if (dni == this.dni[i] && nombreCliente.equals(this.nombreCliente[i])) {
                return i;
            }
        }
        return -1;
    }

    private double obtenerCredito(double dni, String nombreCliente) {
        int posicionCliente = obtenerPosicionCliente(dni, nombreCliente);
        double saldoCliente = saldo[posicionCliente];
        if (saldoCliente > 20000) {
            return 100000;
        } else {
            return 0;
        }
    }

    public String toString(double dni, String nombreCliente) {
        if (!validarCliente(dni, nombreCliente)) {
            return "Cliente no encontrado.";
        }
        int posicionCliente = obtenerPosicionCliente(dni, nombreCliente);
        double credito = obtenerCredito(dni, nombreCliente);
        return "\nBANCO: " + nombreBanco +
                "\nNombre: " + nombreCliente +
                "\nDNI: " + dni +
                "\nnro. Cuenta: " + numeroCuenta[posicionCliente] +
                "\nSaldo Inicial: " + saldo[posicionCliente] +
                "\nCrédito: " + credito+
                "\nSaldo Final: " + (saldo[posicionCliente]+credito);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        while (true) {
            System.out.println("BANCO " + cuenta.nombreBanco);
            System.out.print("Nombre del Cliente: ");
            String nombreCliente = scanner.nextLine();
            System.out.print("DNI: ");
            double dni = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            System.out.println(cuenta.toString(dni, nombreCliente));
            System.out.print("¿Desea buscar otro cliente? (S/N): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
