import java.util.Scanner;

public class Ex05{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        for(int i=0; i<vetor.length; i++){
            System.out.println("Informe um valor para posicao "+i+" do vetor:");
            vetor[i] = sc.nextInt();
        }
        System.out.print("Vetor:\n[");
        for(int i=0; i<vetor.length; i++){
            if(i==vetor.length-1){
                System.out.print(vetor[i]+"]\n");
            }else{
                System.out.print(vetor[i]+" ");
            }
        }
        for(int i=0; i<vetor.length; i++){
            for(int j=i+1; j<vetor.length; j++){
                if((vetor[i]==vetor[j])&&(vetor[i]!=0)){
                    System.out.println("Valor repetido: "+vetor[j]+" | Posicao: "+j);
                    vetor[j] = 0;
                }
            }
        }
    }
}