package personas;


import persona.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Personas {
    //2
    String nombre;
    LocalDate fechaDeNacimiento;

    public Personas(String nombre, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    static ArrayList<Personas> personas = new ArrayList<>();

    public void annadirPersona(Personas persona) {
        this.personas.add(persona);
    }
    public static void Mostrar() {
        System.out.println(personas.toString());
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Fecha de nacimiento: " + fechaDeNacimiento;
    }
    //3
    public static String masJoven(){
        return personas.stream().min(Comparator.comparingInt(p -> p.fechaDeNacimiento.getYear())).map(persona -> persona.getNombre()).get();
    }
    public static int calcularSumaEdades(){
        return personas.stream().mapToInt(persona -> persona.getEdad()).sum();
    }
    public static int calcularEdadMinima(){
        return personas.stream().mapToInt(persona -> persona.getEdad()).min().getAsInt();
    }
    public static double calcularEdadMedia(){
        int total = personas.stream().mapToInt(persona -> persona.getEdad()).sum();
        double media = (double) total/personas.size();
        return media;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return LocalDate.now().getYear() - fechaDeNacimiento.getYear();
    }

}

