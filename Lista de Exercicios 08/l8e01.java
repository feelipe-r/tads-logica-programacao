import java.util.Scanner;

public class l8e01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t;

        System.out.println("Informe a quantidade de números que serão lidos:");
        t = sc.nextInt();

        int[] vetor = new int[t];

        for(int i=0; i<vetor.length; i++){
            System.out.println("Informe um número para posição "+i+" do vetor:");
            vetor[i] = sc.nextInt();
        }
        System.out.print("[");
        for(int i=vetor.length-1; i>=0; i--){
            if(i==0){
                System.out.print(vetor[i]+"]");
            }else{
                System.out.print(vetor[i]+" ");
            }
        }
    }
}