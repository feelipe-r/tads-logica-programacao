import java.util.Scanner;

public class l4e27{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int l, n, aux=0, soma=0;

        System.out.println("Informe o número de loops:");
        l = sc.nextInt();

        System.out.println("Informe um número inteiro:");
        n = sc.nextInt();

        while(aux<l){
            n = (n*2);
            soma = (n+(n/2));
            
            System.out.println("=========================================");
            System.out.println("Dobro: "+n+" - Soma com antecessor: "+soma);
            aux++;
        }
    }
}