import java.util.Scanner;

public class Ex10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[20];
        int p1=0, p2=1, aux;

        for(int i=0; i<vetor.length; i++){
            System.out.println("Informe um numero para posicao "+i+" do vetor:");
            vetor[i] = sc.nextInt();
        }
        while(p1!=p2){
            System.out.print("Vetor:\n[");

            for(int i=0; i<vetor.length; i++){
                if(i==vetor.length-1){
                    System.out.print(vetor[i]+"]\n");
                }else{
                    System.out.print(vetor[i]+" ");
                }
            }
            System.out.println("Escolha a primeira posicao:");
            p1 = sc.nextInt();

            while((p1<0)||(p1>vetor.length-1)){
                System.out.println("Posicao invalida! Escolha uma nova posicao:");
                p1 = sc.nextInt();
            }
            System.out.println("Escolha a segunda posicao:");
            p2 = sc.nextInt();

            while((p2<0)||(p2>vetor.length-1)){
                System.out.println("Posicao invalida! Escolha uma nova posicao:");
                p2 = sc.nextInt();
            }
            if(p1==p2){
                break;
            }
            aux = vetor[p1];
            vetor[p1] = vetor[p2];
            vetor[p2] = aux;
        }
    }
}