import java.util.Scanner;

public class l5e07{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Informe o primeiro número inteiro:");
        a = sc.nextInt();

        System.out.println("Informe o segundo número inteiro:");
        b = sc.nextInt();

        if(a>b){
            if(a%b==0){
                System.out.println("São multiplos!");
            }else{
                System.out.println("NÃO são multiplos!");
            }
        }else{
            if(b%a==0){
                System.out.println("São multiplos!");
            }else{
                System.out.println("NÃO são multiplos!");
            } 
        }
    }
}