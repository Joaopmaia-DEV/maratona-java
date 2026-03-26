package academy.devdojo.maratonajava.javacore.Bintrucaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintrucaoclasses.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = new int[]{1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
