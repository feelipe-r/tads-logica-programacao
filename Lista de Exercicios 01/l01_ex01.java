import java.util.Scanner;

public class l01_ex01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número:");
        int n = sc.nextInt();

        int ant = (n-1);

        System.out.println("O Número antecessor ao digitado é: "+ant);
    }
}