import java.util.Scanner;

public class l8e05{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[20];
        int aux=0, j=10;

        for(int i=0; i<vetor.length; i++){
            System.out.println("Informe um número inteiro para posição "+i+" do vetor:");
            vetor[i] = sc.nextInt();
        }
        System.out.print("Vetor preenchido:\n[");
        for(int i=0; i<vetor.length; i++){
            if(i==vetor.length-1){
                System.out.print(vetor[i]+"]");
            }else{
                System.out.print(vetor[i]+" ");
            }
        }
        for(int i=0; i<vetor.length/2; i++){
            aux = vetor[j];
            vetor[j] = vetor[i];
            vetor[i] = aux;
            j++;
        }
        System.out.print("\nVetor atualizado:\n[");
        for(int i=0; i<vetor.length; i++){
            if(i==vetor.length-1){
                System.out.print(vetor[i]+"]");
            }else{
                System.out.print(vetor[i]+" ");
            }
        }
    }
}