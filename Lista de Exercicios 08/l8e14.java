import java.util.Scanner;

public class l8e14{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int t=1, x, y, aux;

        for(int i=0; i<vetor.length; i++){
            System.out.println("Informe um número para posição "+i+" do vetor:");
            vetor[i] = sc.nextInt();
        }
        while(t>0){
            System.out.println("Informe as posições do vetor que devem ser trocadas:");
            x = sc.nextInt();
            y = sc.nextInt();

            aux = vetor[x];
            vetor[x] = vetor[y];
            vetor[y] = aux;

            System.out.print("Vetor:\n[");
            for(int i=0; i<vetor.length; i++){
                if(i==vetor.length-1){
                    System.out.print(vetor[i]+"]");
                }else{
                    System.out.print(vetor[i]+" ");
                }
            }
            System.out.println("\nDigite:\n1-Nova troca de posições\n0-Sair");
            t = sc.nextInt();
        }
    }
}