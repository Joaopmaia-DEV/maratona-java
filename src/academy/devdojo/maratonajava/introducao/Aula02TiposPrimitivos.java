package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // atalho para public static void main -> psvm + tab
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long bigNumber =  (long) 155.23;
        double salaryDouble = 2000.0D;
        float salaryFloat = (float) 2500.0D;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = 65;
        String nick = "Goku";
        // atalho para System.out.println -> sout + tab
        System.out.println("The age is: "+age+" years");
        System.out.println(falso);
        System.out.println("char "+character);
        System.out.println(bigNumber);
        System.out.println("Oi meu nome é "+nick);
    }
}
