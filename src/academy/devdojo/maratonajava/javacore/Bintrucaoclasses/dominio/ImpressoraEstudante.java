package academy.devdojo.maratonajava.javacore.Bintrucaoclasses.dominio;

public class ImpressoraEstudante {
    public void Imprime(Estudante estudante){
        System.out.println("------------------------");


        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        estudante.nome = "Gohan";

    }

}
