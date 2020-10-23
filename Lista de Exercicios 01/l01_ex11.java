import java.util.Scanner;
import java.lang.Math;

public class l01_ex11{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor 'a' da equação:");
        int a = sc.nextInt();

        System.out.println("Informe o valor 'b' da equação:");
        int b = sc.nextInt();

        System.out.println("Informe o valor 'c' da equação:");
        int c = sc.nextInt();

        double delta = ((b*b)-(4*a*c));
        double rd = Math.sqrt(delta);
        double x1 = ((-b+rd)/(2*a));
        double x2 = ((-b-rd)/(2*a));

        System.out.println("Valor de X-1: "+x1);
        System.out.println("Valor de X-2: "+x2);
    }
}