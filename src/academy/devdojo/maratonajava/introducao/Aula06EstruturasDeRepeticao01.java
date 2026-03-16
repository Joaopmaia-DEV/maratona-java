package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    static void main(String[] args) {
        // while, do while, for
        int count = 0; int a = count;
        while (count < 10) {
            System.out.println(++count);
        }
        count = a;
        do {
            System.out.println("dentro do do-while "+ ++count);
        } while (count < 10);
        for(int i = 0; i <10 ;i++){
            System.out.println("For " + i);
        }
    }
}
