import java.util.Scanner;

public class l01_ex09{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número de homens convidados:");
        int h = sc.nextInt();

        System.out.println("Informe o número de mulheres convidadas:");
        int m = sc.nextInt();

        System.out.println("Informe o número de crianças convidadas:");
        int c = sc.nextInt();

        int qnt_h = (h*400);
        int qnt_m = (m*320);
        int qnt_c = (c*200);

        double qnt_t = (qnt_h+qnt_m+qnt_c);
        double mrg = (qnt_t*0.20);

        qnt_t = (qnt_t+mrg);

        System.out.println("Quantidade total de carne a ser comprada: "+qnt_t+" Gramas");
    }
}
