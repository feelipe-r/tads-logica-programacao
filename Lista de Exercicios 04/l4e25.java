import java.util.Scanner;

public class l4e25{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n=1, soma_i=0, aux=1;

        while(n>0){
            System.out.println("Informe um número:");
            n = sc.nextInt();

            while(soma_i<n){
                if(aux%2!=0){
                    soma_i = (soma_i+aux);
                } 
                aux++;
            }
            if(soma_i==n){
                System.out.println("Quadrado perfeito!");
            }else{
                System.out.println("NÃO!");
            }
            soma_i=0;
            aux=1;
        }
    }
}