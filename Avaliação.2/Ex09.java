import java.util.Scanner;

public class Ex09{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[20];
        int c=1, p1, p2;

        for(int i=0; i<vetor.length; i++){
            System.out.println("Informe um numero para posicao "+i+" do vetor:");
            vetor[i] = sc.nextInt();
        }
        while(c==1){
            System.out.println("Informe a primeira posicao do vetor:");
            p1 = sc.nextInt();

            while((p1<0)||(p1>vetor.length-1)){
                System.out.println("Posicao invalida! Informe uma nova posicao:");
                p1 = sc.nextInt();
            }
            System.out.println("Informe a segunda posicao do vetor:");
            p2 = sc.nextInt();

            while((p2<0)||(p2>vetor.length-1)){
                System.out.println("Posicao invalida! Informe uma nova posicao:");
                p2 = sc.nextInt();
            }
            if(vetor[p1]>vetor[p2]){
                System.out.println("O valor da primeira posicao eh maior que o da segunda");
            }
            else if(vetor[p1]<vetor[p2]){
                System.out.println("O valor da segunda posicao eh maior que o da primeira");
            }else{
                System.out.println("Os valores das posicoes informadas sao iguais");
            }
            System.out.println("Digite 1 para fazer uma nova comparacao e 0 para sair");
            c = sc.nextInt();
        }
    }
}