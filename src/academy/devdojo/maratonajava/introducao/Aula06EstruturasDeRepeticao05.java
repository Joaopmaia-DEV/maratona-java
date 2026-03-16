package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição  valorParcela >= 1000
    public void main(String[] args) {
        double valorCarro = 30000;
        double valorParcela;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
            continue;
            }
            System.out.println("Parcela " + parcela + " Valor R$ " + valorParcela);


        }
    }

}