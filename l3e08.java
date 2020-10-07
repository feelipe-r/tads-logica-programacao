import java.util.Scanner;

public class l3e08{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int code, pass;
        int cd = 1234, ps = 9999;

        System.out.println("Informe o código do usuário:");
        code = sc.nextInt();

        if(code==cd){
            System.out.println("Informe a senha:");
            pass = sc.nextInt();

            if(pass==ps){
                System.out.println("Acesso permitido");
            }else{
                System.out.println("Senha incorreta");
            }
        }else{
            System.out.println("Usuário inválido");
        }
    }
}