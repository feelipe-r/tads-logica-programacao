import java.util.Scanner;

public class l2e2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a base do retângulo:");
        float b = sc.nextFloat();

        System.out.println("Informe a altura do retângulo:");
        float a = sc.nextFloat();

        float area = (a*b);
        float perimetro = ((a*2)+(b*2));

        System.out.println("Área do retângulo: "+area);
        System.out.println("Perimetro do retângulo: "+perimetro);
    }
}