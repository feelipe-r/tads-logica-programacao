import java.util.Scanner;

public class l8e04{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] par = new int[vetor.length];
        int[] impar = new int[vetor.length];

        for(int i=0; i<vetor.length; i++){
            System.out.println("Informe um número para posição "+i+" do vetor:");
            vetor[i] = sc.nextInt();

            if(vetor[i]%2==0){
                par[i] = vetor[i];
            }else{
                impar[i] = vetor[i];
            }
        }
        System.out.print("PARES:\n[ ");
        for(int i=0; i<par.length; i++){
            if(par[i]!=0){   
                System.out.print(par[i]+" ");
            }
        }
        System.out.print("]\nÍMPARES:\n[ ");
        for(int i=0; i<impar.length; i++){
            if(impar[i]!=0){
                System.out.print(impar[i]+" ");
            }
        }
        System.out.print("]");  
    }
}