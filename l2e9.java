import java.util.Scanner;

public class l2e9{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o raio da circunferência:");
        float raio = sc.nextFloat();

        float pi = 3.141692f;
        float diam = (raio*2);
        float comp = (2*(pi*raio));
        float area = (pi*(raio*raio));
        
        System.out.printf("Diâmetro da circunferência: %.2f%n", diam);
        System.out.printf("Comprimento da circunferência: %.2f%n", comp);
        System.out.printf("Área da circunferência: %.2f%n", area);
    }
}