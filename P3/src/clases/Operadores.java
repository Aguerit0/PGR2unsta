package clases;
//utilizar todos los operadores de java o hacer calculadora
public class Operadores {
    private double num1, num2;

    public Operadores(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumaEnteros(){
        return this.num1+this.num2;
    }
    public double restaEnteros(){
        return this.num1-this.num2;
    }
    public double multiplicacionEnteros(){
        return this.num1*this.num2;
    }
    public double divisionEnteros(){
        return (this.num1/this.num2);
    }
    public double modEnteros(){
        return this.num1%this.num2;
    }
    public double potenciaEnteros(){
        return Math.pow(this.num1,this.num2);
    }
    public double raizEnteros(){
        return Math.sqrt(this.num1);
    }
    public String andEnteros(){
        return this.num1+" && "+this.num2;
    }
    public String orEnteros(){
        return this.num1+" || "+this.num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
