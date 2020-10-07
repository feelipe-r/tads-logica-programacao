import java.util.Scanner;

public class l4e07{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int pass = 12345;
        int x=0, a=0;

        while(x!=pass){
            System.out.println("Informe a senha:");
            x = sc.nextInt();
            a++;
        }
        System.out.println("Número de tentativas até acertar a senha: "+a);
    }
}