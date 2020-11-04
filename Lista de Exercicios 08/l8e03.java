import java.util.Scanner;

public class l8e03{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float soma=0, media;
        float[] vetor = new float[10];

        for(int i=0; i<vetor.length; i++){
            System.out.println("Informe um valor para posição "+i+" do vetor:");
            vetor[i] = sc.nextFloat();

            soma = (soma+vetor[i]);
        }
        media = (soma/vetor.length);
        System.out.printf("Média dos valores do vetor: %.2f%n",media);
    }
}