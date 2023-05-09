package clases;

import java.time.LocalDate;
import java.time.Period;

public class Alumnos {
    private int legajo;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String email;
    private int cantMateriasAprobadas;
    private int cantMateriasDesaprobadas;
    private boolean cuotaAlDia;

    public Alumnos(int legajo, String nombre, LocalDate fechaNacimiento, String email) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.cantMateriasAprobadas = 0;
        this.cantMateriasDesaprobadas = 0;
        this.cuotaAlDia = false;
    }

    public int getEdad() {
        LocalDate today = LocalDate.now();
        return Period.between(fechaNacimiento, today).getYears();
    }

    public void aprobarMateria() {
        cantMateriasAprobadas++;
    }

    public void desaprobarMateria() {
        cantMateriasDesaprobadas++;
    }

    public int getCantMateriasAprobadas() {
        return cantMateriasAprobadas;
    }

    public int getCantMateriasDesaprobadas() {
        return cantMateriasDesaprobadas;
    }

    public boolean isCuotaAlDia() {
        return cuotaAlDia;
    }

    public void setCuotaAlDia(boolean cuotaAlDia) {
        this.cuotaAlDia = cuotaAlDia;
    }

        public static void main(String[] args) {
            LocalDate fechaNacimiento = LocalDate.of(2000, 1, 1);
            Alumnos alumno = new Alumnos(1, "Juan", fechaNacimiento, "juan@gmail.com");

            int edad = alumno.getEdad();
            System.out.println("Edad: " + edad);

            alumno.aprobarMateria();
            alumno.aprobarMateria();
            alumno.desaprobarMateria();
            int cantMateriasAprobadas = alumno.getCantMateriasAprobadas();
            int cantMateriasDesaprobadas = alumno.getCantMateriasDesaprobadas();
            System.out.println("Materias aprobadas: " + cantMateriasAprobadas);
            System.out.println("Materias desaprobadas: " + cantMateriasDesaprobadas);

            alumno.setCuotaAlDia(true);
            boolean cuotaAlDia = alumno.isCuotaAlDia();
            System.out.println("Cuota al día:" + cuotaAlDia);
        }
}
