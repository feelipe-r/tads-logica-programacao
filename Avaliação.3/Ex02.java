import java.util.Scanner;

public class Ex02{

    static void printVetor(int[] vetor){
        System.out.print("[");
        for(int i=0; i<vetor.length; i++){
            if(i==vetor.length-1){
                System.out.print(vetor[i]+"]");
            }else{
                System.out.print(vetor[i]+" ");
            }
        }
        System.out.println(" ");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int[] vet = new int[30];
        int aux, z = 0;

        for(int i=0; i<vet.length; i++){
            System.out.println("Informe um numero para posicao "+i+" do vetor:");
            vet[i] = sc.nextInt();

            if(vet[i]==0){
                z++;
            }
        }
        System.out.println("Vetor original:");
        printVetor(vet);

        for(int i=0; i<vet.length; i++){
            for(int j=i+1; j<vet.length; j++){
                if(vet[i]==0){
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        System.out.println("Vetor realocado:");
        printVetor(vet);
        System.out.println("Quantidade de zeros no vetor: "+z);
    }
}