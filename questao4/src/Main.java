import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double i;double soma=0;int cont=0;
        Scanner entrada= new Scanner(System.in);
        i= entrada.nextDouble();
        while (i>=0){
            i= entrada.nextDouble();
            soma+=i;
            cont++;
        }
        System.out.println("a media e de "+soma/cont);
        System.out.println("a quantidade e de "+cont);


    entrada.close();
    }
}