import java.util.Scanner;

public class l4e01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n;
        int x=1, soma=0;

        System.out.println("Informe um número inteiro:");
        n = sc.nextInt();

        while(x<n){
            soma = (soma+x);
            x++;
        }
        System.out.println("Soma dos números: "+soma);
    }
}