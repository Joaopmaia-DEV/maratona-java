package academy.devdojo.maratonajava.javacore.Bintrucaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintrucaoclasses.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.divideDoisNumeros(20,2);
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,0));
        System.out.println("----------------");
        calculadora.imprimeDivisaoDeDoisNumeros(20, 0);

    }
}

