import java.util.Scanner;

public class l2e04{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int n1 = sc.nextInt();

        System.out.println("Informe outro número inteiro:");
        int n2 = sc.nextInt();

        if(n1>n2){
            System.out.println("O número maior é: "+n1);
        }else{
            System.out.println("O número maior é: "+n2);
        } 
    }
}