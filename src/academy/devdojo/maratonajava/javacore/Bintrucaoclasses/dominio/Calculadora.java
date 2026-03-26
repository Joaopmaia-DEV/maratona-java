package academy.devdojo.maratonajava.javacore.Bintrucaoclasses.dominio;


public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(long num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
//        if (num2 == 0) {
//            return 1;
//        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 1;

    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0 && num1 == 0) {
            System.out.println("Indetermination!");
            return;
        }
        if (num2 == 0) {
            System.out.println("Indefinite!");
            return;
        }
        System.out.println(num1 / num2);

    }

}
