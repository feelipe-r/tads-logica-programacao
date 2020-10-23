import java.util.Scanner;

public class l2e12{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float custo;

        System.out.println("Informe o número de maças compradas:");
        int n_apple = sc.nextInt();

        if(n_apple<12){
            custo = (n_apple*1.50f);
            System.out.printf("Valor total da compra: R$%.2f%n",custo);
        }else{
            custo = (n_apple*1.30f);
            System.out.printf("Valor total da compra: R$%.2f%n",custo);
        }
    }
}