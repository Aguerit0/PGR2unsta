package clases;

public class Persona {
    //datos de persona, devoler con to string, calcular mayor y meor
    String nombre, apellido;
    int edad;
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public String isGreater(){
        if (this.edad>=18){
            return  "ES MAYOR DE EDAD";
        }else{
            return  "ES MENOR DE EDAD";
        }
    }

    @Override
    public String toString() {

        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +isGreater()+

                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
