package persona;

import personas.Personas;

import java.time.LocalDate;


public class Persona {
    //Ejercicio 17
    //1
    static int edad;
    public static void calcularEdad (String nombre, LocalDate fechaDeNacimiento){
        edad = LocalDate.now().getYear() - fechaDeNacimiento.getYear();
        System.out.println("La edad de " + nombre + " es " + edad + " años.");
    }
}
