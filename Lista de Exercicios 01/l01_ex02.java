import java.util.Scanner;

public class l01_ex02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número real:");
        double n = sc.nextDouble();

        double n_update = ((n*0.20)+n);

        System.out.println("Valor atualizado com 20%: "+n_update);
    }
}