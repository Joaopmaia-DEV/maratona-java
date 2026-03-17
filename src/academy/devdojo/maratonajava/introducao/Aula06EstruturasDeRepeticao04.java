package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição  valorParcela >= 1000
    static void main(String[] args) {
        double valorCarro = 1200;
        double valorParcela;
        int parcela = 1;
        for(parcela = 1;; parcela++){
            valorParcela = valorCarro / parcela;
            if(valorParcela < 300){
                break;
            }
            System.out.println("Parcela "+parcela+" Valor "+valorParcela);

        }

    }
}
