import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double i;double soma=0;double cont=0;
        Scanner entrada= new Scanner(System.in);
        i= entrada.nextDouble();
        soma+=i;
        while (i>=0){
            i= entrada.nextDouble();
            if (i>=0){
                soma+=i;
            }
            cont++;
        }
        System.out.println("a media e de "+soma/cont);
        System.out.println("a quantidade e de "+cont);

    entrada.close();
    }
}