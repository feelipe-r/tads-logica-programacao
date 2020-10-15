import java.util.Scanner;

public class l5e11{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int pass;

        System.out.println("Informe uma senha:");
        pass = sc.nextInt();

        while(pass!=2002){
            System.out.println("Senha inválida!\nInforme uma nova senha:");
            pass = sc.nextInt();
        }
        System.out.println("Acesso permitido!");
    }
}