import java.util.Scanner;

public class l8e15{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[20];
        int x, a=0;

        for(int i=0; i<vetor.length; i++){
            System.out.println("Informe um número para posição "+i+" do vetor:");
            vetor[i] = sc.nextInt();
        }
        System.out.print("Vetor:\n[");
        for(int i=0; i<vetor.length; i++){
            if(i==vetor.length-1){
                System.out.print(vetor[i]+"]");
            }else{
                System.out.print(vetor[i]+" ");
            }
        }
        System.out.println("\nInforme um número para buscar no vetor:");
        x = sc.nextInt();

        for(int i=0; i<vetor.length; i++){
            if(vetor[i]==x){
                System.out.println("Número encontrado na posição "+i+" do vetor");
                a++;
            }
        }
        if(a==0){
            System.out.println("O número informado não consta no vetor");
        }
    }
}