package academy.devdojo.maratonajava.javacore.Bintrucaoclasses.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;


    public void imprimir(Funcionario funcionario) {
        System.out.println("Nome do funcionario " + this.nome);
        System.out.println("Idade do funcionario " + this.idade);
        System.out.print("Salario(s): ");
        if (this.salario == null) {
            return;
        }
        for (double v : this.salario) {
            System.out.print(" " + v + " ");
        }
        System.out.println("\n");

    }

    public void imprimirMediaSalario(double... array) {
        double soma = 0;
        if (array == null) {
            return;
        }
        for (double i : array) {
            soma += i;
        }


        System.out.println("Média salarial " + (soma / array.length));

    }

}
