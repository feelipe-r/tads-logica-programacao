import java.util.Scanner;

public class Ex01{

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

        int[] vet1 = new int[10];
        int[] vet2 = new int[vet1.length];
        int[] vet3 = new int[vet2.length];
        int[] vetR = new int[vet3.length];
        int[] aux = new int[3];
        int menor;

        for(int i=0; i<vet1.length; i++){
            System.out.println("Informe um valor para posicao "+i+" do primeiro vetor:");
            vet1[i] = sc.nextInt();
        }
        for(int i=0; i<vet2.length; i++){
            System.out.println("Informe um valor para posicao "+i+" do segundo vetor:");
            vet2[i] = sc.nextInt();
        }
        for(int i=0; i<vet3.length; i++){
            System.out.println("Informe um valor para posicao "+i+" do terceiro vetor:");
            vet3[i] = sc.nextInt();
        }
        System.out.println("Primeiro vetor:");
        printVetor(vet1);

        System.out.println("\nSegundo vetor:");
        printVetor(vet2);

        System.out.println("\nTerceiro vetor:");
        printVetor(vet3);

        for(int i=0; i<vetR.length; i++){
            aux[0] = vet1[i];
            aux[1] = vet2[i];
            aux[2] = vet3[i];

            menor = aux[0];

            for(int j=0; j<aux.length; j++){
                if(aux[j]<menor){
                    menor = aux[j];
                }
            }
            vetR[i] = menor;
        }
        System.out.println("\nVetor resultado:");
        printVetor(vetR); 
    }
}