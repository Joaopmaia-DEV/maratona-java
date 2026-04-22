package academy.devdojo.maratonajava.javacore.Bintrucaoclasses.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double soma;


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
        if (array == null) {
            return;
        }
        for (double i : array) {
            soma += i;
        }


        System.out.println("Média salarial " + (this.soma / array.length));

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
