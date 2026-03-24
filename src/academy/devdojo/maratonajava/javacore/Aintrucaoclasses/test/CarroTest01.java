package academy.devdojo.maratonajava.javacore.Aintrucaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintrucaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "Jeep Compass";
        carro.modelo = "S";
        carro.ano = 2026;


        Carro carro2 = new Carro();

        carro2.nome = "Mercedes C63 S";
        carro2.modelo = "AMG";
        carro2.ano = 2025;

        System.out.println("Carro 1");
        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano + "\n");
        System.out.println("Carro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano + "\n");

    }
}
