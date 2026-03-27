package academy.devdojo.maratonajava.javacore.Bintrucaoclasses.test;


import academy.devdojo.maratonajava.javacore.Bintrucaoclasses.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.idade = 19;
        funcionario.salario = new double[]{2500, 3200, 4350};
        funcionario.imprimir(funcionario);
        funcionario.imprimirMediaSalario(funcionario.salario);
        /*
        CASO VOCÊ NÃO QUEIRA PASSAR PARAMETRO PARA O METODO, FAÇA O METODO NO MESMO LUGAR QUE AS ATRIBUIÇÕES
        POIS PODEMOS USAR O "THIS" PARA FAZER O METODO PEGAR O SEU PRÓPRIO OBJETO. NESSE CASO DARIA, POIS AS ATRIBUIÇÕES
        ESTÃO NO MESMO LUGAR QUE O METODO FOI INSTITUIDO, PODENDO FAZER:
        funcionario.imprimir();
        funcionario.imprimirMediaSalario();
        POREM TERIA QUE TIRAR O PARAMETRO DOS METODOS NA CLASSE "FUNCIONARIO"
         */
    }
}
