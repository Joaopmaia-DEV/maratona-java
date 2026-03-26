package academy.devdojo.maratonajava.javacore.Bintrucaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintrucaoclasses.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintrucaoclasses.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();


        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressoraEstudante.Imprime(estudante01);

        impressoraEstudante.Imprime(estudante02);

        System.out.println("#############################");

        impressoraEstudante.Imprime(estudante01);

        impressoraEstudante.Imprime(estudante02);

    }
}
