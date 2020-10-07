import java.util.Scanner;

public class l4e12{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Informe um número inteiro:");
        n = sc.nextInt();

        while(n%5!=0){
            System.out.println("O número informado não é multiplo de 5! Informe outro número:");
            n = sc.nextInt();
        }
        System.out.println("Número multiplo de 5!");
    }
}