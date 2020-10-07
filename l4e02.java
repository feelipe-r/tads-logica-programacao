import java.util.Scanner;

public class l4e02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n;
        int x=1, soma=0;

        System.out.println("Informe um número inteiro:");
        n = sc.nextInt();

        while(x<n){
            if(x%2==0){
                soma = (soma+x);
            }
            x++;
        }
        System.out.println("Soma dos números pares: "+soma);
    }
}