import java.util.Scanner;

public class l01_ex05{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma temperatura em Fahrenheit:");
        double tf = sc.nextDouble();

        double tc = ((tf-32)*5/9);

        System.out.printf("Temperatura em Celsius: %.2f %n", +tc);
    }
}