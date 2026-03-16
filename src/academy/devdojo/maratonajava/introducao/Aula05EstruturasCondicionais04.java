package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    static void main() {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto = salarioAnual;
        if(salarioAnual <= 34712){
            valorImposto *= primeiraFaixa;
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto *= segundaFaixa;
        }else if (salarioAnual >= 68508){
            valorImposto *= terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
