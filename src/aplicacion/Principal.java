package aplicacion;

import mates.Funciones;
import persona.Persona;
import personas.Personas;

import java.time.LocalDate;
import java.util.List;
import java.util.function.DoubleUnaryOperator;

import static mates.Funciones.calculateIntegral;
import static mates.Funciones.integrateRectangles;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Ejercicio 13");
        DoubleUnaryOperator function = x -> Math.exp(x * x);
        double a = 0.1;
        double b = 1.0;
        int n = 1000;
        double h = (b - a) / n;
        System.out.println("El valor aproximado de la integral es " + integrateRectangles(function, a, b, n, h));

        System.out.println("Ejercicio 14");
        Funciones.apartado1();
        Funciones.apartado2();
        Funciones.apartado3();
        Funciones.apartado4();

        System.out.println("Ejercicio 15");
        System.out.println("1) La suma de los números hasta el 10 es " + Funciones.suma(10));
        System.out.println("2) El factorial del 5 es " + Funciones.factorial(5));
        System.out.println("3) La potencia n-ésima de un número es " + Funciones.potencia(2,2));
        List<Integer> l = List.of(1,2,3,4);
        List<Double> l2 = List.of(1.0,2.0,3.0,4.0);
        System.out.println("4) La suma de los elementos de la lista es " + Funciones.lista(l));
        System.out.println("5) La media de los elementos de la lista es " + Funciones.media(l2));
        Funciones.desviacion(l2);
        System.out.println("7) La suma de los primeros números pares hasta n asumiendo n ≥ 2 es " + Funciones.sumapares(9));
        System.out.println("8) La suma de los elementos pares de una lista de enteros " + Funciones.listaenteros(l));
        System.out.println("9) La nueva lista de números pares es " + Funciones.obtenerlistaenteros(l));
        System.out.println("10) La lista de los primeros números pares hasta n asumiendo n ≥ 2 son " + Funciones.listapares(9));
        List<Integer> l3 = List.of(1,2,3);
        List<Integer> l4 = List.of(2,4,6);
        System.out.println("11) El producto escalar es " + Funciones.productoescalar(l3,l4));
        System.out.println("12) El elemento n-ésimo de la sucesión de Fibonacci es " + Funciones.fibonachi(9));

        System.out.println("Ejercicio 16");
        System.out.println("El valor aproximado de la integral es: " + calculateIntegral(function, a, b, n));

        System.out.println("Ejercicio 17");
        Persona.calcularEdad("Pepe", LocalDate.of(2005, 7,12));
        Persona.calcularEdad("Gustavo", LocalDate.of(2000, 3,30));
        Personas persona1=new Personas("Pepe", LocalDate.of(2005, 7,12));
        Personas persona2=new Personas("Gustavo", LocalDate.of(2000, 3,30));
        persona1.annadirPersona(persona1);
        persona2.annadirPersona(persona2);
        Personas.Mostrar();
        System.out.println("El más joven es " + Personas.masJoven() + ".");
        System.out.println("La suma de las edades es " + Personas.calcularSumaEdades()+ " años.");
        System.out.println("La edad mínima es " + Personas.calcularEdadMinima() + " años.");
        System.out.println("La edad media es " + Personas.calcularEdadMedia() + " años.");
    }
}