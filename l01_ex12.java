import java.util.Scanner;

public class l01_ex12{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a média do aluno:");
        double media = sc.nextDouble();

        if(media>=7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Recuperação!");
        }
    }
}