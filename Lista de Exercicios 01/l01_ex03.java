import java.util.Scanner;

public class l01_ex03{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int n = sc.nextInt();

        int quad = (n*n);

        System.out.println("Quadrado do número informado: "+quad);
    }
}