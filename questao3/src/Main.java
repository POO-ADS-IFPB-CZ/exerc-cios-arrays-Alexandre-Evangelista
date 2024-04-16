public class Main {
    public static void main(String[] args) {
        double[] notas= {7.5, 8.0, 6.5, 9.0, 7.0, 6.0, 8.5, 9.5, 8.0, 7.5};
        double media=0;
        int cont=0;
        for (int i=0;i<10;i++){
           media+=notas[i];
           if (notas[i]>=7.0){
               cont++;
           }
        }
        System.out.println("a media da sala é de "+media/10);
        System.out.println(cont+" alunos atigiram nota maior que 7");

    }
}