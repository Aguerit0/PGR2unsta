package clases;

//sumar dos numeros enteros
public class SumarEnteros {
    int numero1, numero2, resultado;

    public SumarEnteros(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = numero1 + numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return  ", resultado =" + resultado +
                '}';
    }
}
