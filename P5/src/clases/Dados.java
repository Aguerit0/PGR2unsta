package clases;
//emular un juego de dados. Dos personas lanzan 10 veces cada una un dado.
// Se debe decir quien de los dos hizo más punto
import java.util.Random;

public class Dados {
    private String nombre;
    private int puntos;

    public Dados(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void lanzarDados() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            puntos += rand.nextInt(6) + 1;
        }
    }
        public static void main(String[] args) {
            Dados jugador1 = new Dados("Jugador 1");
            Dados jugador2 = new Dados("Jugador 2");

            jugador1.lanzarDados();
            jugador2.lanzarDados();

            int puntosJugador1 = jugador1.getPuntos();
            int puntosJugador2 = jugador2.getPuntos();

            System.out.println(jugador1.getNombre() + " hizo " + puntosJugador1 + " puntos.");
            System.out.println(jugador2.getNombre() + " hizo " + puntosJugador2 + " puntos.");

            if (puntosJugador1 > puntosJugador2) {
                System.out.println(jugador1.getNombre() + " ganó.");
            } else if (puntosJugador2 > puntosJugador1) {
                System.out.println(jugador2.getNombre() + " ganó.");
            } else {
                System.out.println("Empate.");
            }
        }
    }

