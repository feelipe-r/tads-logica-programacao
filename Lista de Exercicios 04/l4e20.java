import java.util.Scanner;

public class l4e20{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int lado, ax=1, ay=1;

        System.out.println("Informe o tamanho do lado do quadrado:");
        lado = sc.nextInt();

        while(ay<=lado){
            while(ax<lado){
                System.out.print("* ");
                ax++;
            }
            System.out.println("*");
            ay++;
            ax=1;
        }
    }
}