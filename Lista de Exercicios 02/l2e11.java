import java.util.Scanner;

public class l2e11{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int n1 = sc.nextInt();

        System.out.println("Informe o segundo número:");
        int n2 = sc.nextInt();

        int soma = (n1+n2);

        if(soma>20){
            soma = (soma+8);
            System.out.println(soma);
        }else{
            soma = (soma-10);
            System.out.println(soma);
        }
    }
}