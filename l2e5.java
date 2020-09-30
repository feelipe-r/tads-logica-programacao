import java.util.Scanner;

public class l2e5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor real:");
        float v1 = sc.nextFloat();

        System.out.println("Informe o segundo valor real:");
        float v2 = sc.nextFloat();

        if(v2>0){
            float result = (v1/v2);
            System.out.printf("Resultado da divisão: %.2f.%n", result);
        }else{
            System.out.println("ERRO!");
        }
    }
}