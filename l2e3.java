import java.util.Scanner;

public class l2e3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número:");
        int n = sc.nextInt();

        if(n>=0){
            System.out.println("Número positivo!");
        }else{
            System.out.println("Número negativo!");
        }  
    }
}