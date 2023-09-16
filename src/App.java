// Aula 3 do Professor Fausto - Faculdade Nova Roma; Tipos de dados - INTEIROS, REAIS, CARACTERES E BOOLEANOS

public class App {
    public static void main(String[] args) {

    //INTEIROS

    byte b = 1;
    short s = 1000;
    int i = 1000000;
    long l = 922337203;

    //REAIS

    float f = 3.14f;
    double d = 3.14;

    //CARACTERES

    char letra ='d';
    String letra_s ="d";

    //BOOLEANO (VALOR LOGICO)
    boolean logico = true; //false

    //INTEIROS - Codigos de PRINT

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);

        System.out.println(b + " " + s + " " + i + " " + l);
        System.out.printf("%d %d %d %d\n", b, s ,i , l);

    //REAIS - Codigos de Print

        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        System.out.printf("%f %f\n", f, d);
    
    //CARACTERES - Codigos de Print

        System.out.println("Char:" + letra);
        System.out.println("String:" + letra_s);

        System.out.printf("%s %s\n", letra, letra_s);
    
    //BOOLEANOS - Codigos de Print

        System.out.println("Boleano: " + logico);

        System.out.printf("%s\n", logico);



    // Area de uma Circunferência

    double raio = 2;
    double pi = 3.14;
    double area = 3.14 * raio * raio;
    System.out.printf("A area é %f", area);
}


}

