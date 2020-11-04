import java.util.Scanner;

public class l8e09{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = {5, 9, 15, 18, 4};
        int n, a=0, t=0;

        while(a<vetor.length){
            System.out.println("Informe um número:");
            n = sc.nextInt();

            for(int i=0; i<vetor.length; i++){
                if(n==vetor[i]){
                    a++;
                    vetor[i] = 0;
                }
            }
            t++;
        }
        System.out.println("Tentativas: "+t);
    }
}