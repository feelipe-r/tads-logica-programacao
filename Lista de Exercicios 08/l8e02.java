import java.util.Scanner;
import java.util.Random;

public class l8e02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int t, a=0, r=0;

        System.out.println("Informe o número de vezes que o dado foi lançado:");
        t = sc.nextInt();

        int[] vetor = new int[t];

        for(int i=0; i<vetor.length; i++){
            vetor[i] = rnd.nextInt(7);
        }
        System.out.print("[");
        for(int i=0; i<vetor.length; i++){
            if(i==vetor.length-1){
                System.out.print(vetor[i]+"]");
            }else{
                System.out.print(vetor[i]+" ");
            }
        }
        System.out.println(" ");
        for(int i=0; i<vetor.length; i++){
            for(int j=0; j<vetor.length; j++){
                if((vetor[i]==vetor[j])&&(j!=i)){
                    a++;
                    r = vetor[j];
                }
            }
            if(a>0){
                System.out.println("Número repetido: "+r+" - Repetiu: "+a+" vez(es)");
                a=0;
            }
        }
    }
}