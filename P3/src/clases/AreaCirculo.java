package clases;
//calcular area de un circulo
public class AreaCirculo {
    final double pi = 3.1416;
    double radio;

    public AreaCirculo() {
    }

    public AreaCirculo(double radio) {
        this.radio = radio;
    }

    public double areaCirculo(){
        return this.radio*this.radio*this.pi;
    }

    public double getPi() {
        return pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
