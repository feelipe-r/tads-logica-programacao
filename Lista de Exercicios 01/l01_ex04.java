import java.util.Scanner;

public class l01_ex04{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a base do triângulo:");
        double b = sc.nextDouble();

        System.out.println("Informe a altura do triângulo:");
        double h = sc.nextDouble();

        double a = ((b*h)/2);

        System.out.println("Área total do triângulo: "+a);
    }
}