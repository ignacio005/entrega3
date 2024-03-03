package mates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Funciones {

    //Ejercicio 12
    //Las expresiones Lambda se definen con la regla de correspondencia entre unos argumentos y un resultado.

    //Ejercicio 13
    public static double integrateRectangles(DoubleUnaryOperator function, double a, double b, int n, double h) {
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double x = a + i * h;
            sum += function.applyAsDouble(x);
        }
        return sum * h;
    }

    //Ejercicio 14
    //1
    public static void apartado1(){
        System.out.println("Ejercicio 14 \n");
        System.out.println("Apartado 1:");
        IntStream.of(1, 2, 3, 4, 5).forEach(System.out::println);
    }
    //2
    public static void apartado2(){
        System.out.println("Apartado 2:");
        IntStream.range(1,6).forEach(System.out::println);
    }
    //3
    public static void apartado3(){
        System.out.println("Apartado 3:");
        IntStream.iterate(0,n->n+2).limit(5).forEach(System.out::println);
    }
    //4
    public static void apartado4(){
        Random random = new Random();
        System.out.println("Apartado 4:");
        random.doubles(10).forEach(System.out::println);
    }
    //Ejercicio 15
    //1
    public static int suma (int n){
        return IntStream.rangeClosed(0,n).sum();
    }
    //2
    public static int factorial (int n){
        return IntStream.rangeClosed(1,n).reduce(1,(x,y) -> x*y);
    }
    //3
    public static int potencia (int base, int exponente){
        return IntStream.iterate(base,x -> x).limit(exponente).reduce(1,(x,y) -> x*y);
    }
    //4
    public static int lista (List<Integer> lista){
        return lista.stream().reduce(0,(x,y) -> x+y);
    }
    //5
    public static Double media (List<Double> lista){
        double total=lista.stream().reduce(0.0,(x,y) -> x+y);
        return total/lista.size();
    }
    //6
    public static void desviacion (List<Double> lista){
        lista.stream().reduce(0.0,(x,y) -> x+y);

    }
    //7
    public static int sumapares (int n){
        return IntStream.rangeClosed(0,n).filter(x -> x % 2 == 0).sum();
    }
    //8
    public static int listaenteros (List<Integer> lista){
        return lista.stream().filter(x -> x % 2 == 0).reduce(0,(x,y) -> x+y);
    }
    //9
    public static List obtenerlistaenteros (List<Integer>lista){
        return lista.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }
    //10
    public static List listapares (int n){
        return IntStream.rangeClosed(0,n).filter(x -> x % 2 == 0).boxed().collect(Collectors.toList());
    }
    //11
    public static int productoescalar (List<Integer>lista1, List<Integer>lista2){
        return IntStream.range(0, lista1.size()).map(i -> lista1.get(i) * lista2.get(i)).sum();
    }
    //12
    public static int fibonachi (int n){
        IntStream.range(0, n).map(Funciones::fibonachi).findFirst().orElse(0);
        if (n <= 1) {
            return n;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
    //Ejercicio 16
    public static double calculateIntegral(DoubleUnaryOperator function, double a, double b, int n) {
        double h = (b - a) / n;
        return DoubleStream.iterate(a, x -> x + h).limit(n).map(function).sum() * h;
    }

}