package clases;
//Hacer un programa que emule un carta al azar. Se debe emular un carta de las Francesas. Las mismas tienen tres palos: picas, corazones, trébol y diamantes a su vez cada palo cuenta con 13 cartas las cuales van del 2 al 10, J, Q,K y la A
import java.util.Random;

public class Carta {
    private String palo;
    private String numero;

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }

    public static Carta obtenerCartaAlAzar() {
        String[] palos = {"Picas", "Corazones", "Trébol", "Diamantes"};
        String[] numeros = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        Carta[] cartas = new Carta[52];

        int i = 0;
        for (String palo : palos) {
            for (String numero : numeros) {
                Carta carta = new Carta(palo, numero);
                cartas[i] = carta;
                i++;
            }
        }

        Random rand = new Random();
        int indiceCartaAlAzar = rand.nextInt(cartas.length);

        return cartas[indiceCartaAlAzar];
    }
        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                Carta carta = Carta.obtenerCartaAlAzar();
                System.out.println(carta);
            }
        }
    }

