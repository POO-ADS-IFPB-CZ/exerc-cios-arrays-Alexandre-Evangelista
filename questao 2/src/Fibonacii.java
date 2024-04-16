public class Fibonacii {
    public static void main(String[] args){
        int j;
        int antepnultimo=0; int ultimo=1; int proximo=0;
        for (j=0;j<30;j++){
            antepnultimo=ultimo;
            ultimo=proximo;
            proximo= antepnultimo+ ultimo;
            System.out.println(proximo);
        }
    }
}
