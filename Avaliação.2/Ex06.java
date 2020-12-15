import java.util.Scanner;

public class Ex06{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] aux = new int[vetor.length];
        int cont=0, a=0;

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
                if(vetor[i]==vetor[j]){
                    cont++;
                    vetor[j] = 0;
                }
            }
            if(cont==0){
                aux[i] = vetor[i];
            }
            cont=0;
        }
        System.out.println("Valores unicos presentes no vetor:");
        for(int i=0; i<aux.length; i++){
            if(aux[i]!=0){
                a++;
                System.out.print(aux[i]+" ");
            }
        }
        System.out.println("\nQuantidade de valores unicos no vetor: "+a);
    }
}