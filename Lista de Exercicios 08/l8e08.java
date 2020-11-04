import java.util.Scanner;

public class l8e08{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[6];
        int e, maior=0, menor=0, igual=0;

        for(int i=0; i<vetor.length; i++){
            System.out.println("Informe um valor para posição "+i+" do vetor:");
            vetor[i] = sc.nextInt();
        } 
        System.out.print("VETOR:\n[");
        for(int i=0; i<vetor.length; i++){
            if(i==vetor.length-1){
                System.out.print(vetor[i]+"]");
            }else{
                System.out.print(vetor[i]+" ");
            }
        }
        System.out.println("\nInforme um elemento do vetor:");
        e = sc.nextInt();

        while((e<0)||(e>vetor.length-1)){
            System.out.println("Elemento inexistente!\nInforme novamente:");
            e = sc.nextInt();
        }
        for(int i=0; i<vetor.length; i++){
            if(vetor[e]<vetor[i]){
                maior++;
            }
            else if(vetor[e]>vetor[i]){
                menor++;
            }else{
                igual++;
            }
        }
        System.out.println("Quantidade de valores no vetor maiores que o elemento informado: "+maior);
        System.out.println("Quantidade de valores no vetor menores que o elemento informado: "+menor);
        System.out.println("Quantidade de valores no vetor iguais o elemento informado: "+igual);
    }
}