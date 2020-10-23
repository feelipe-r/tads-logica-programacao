import java.util.Scanner;

public class l2e01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma medida em metros:");
        int m = sc.nextInt();

        int cm = (m*100);

        System.out.println("A medida em centimetros é: "+cm);
    }
}