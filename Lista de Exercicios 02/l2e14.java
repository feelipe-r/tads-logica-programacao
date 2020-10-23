import java.util.Scanner;

public class l2e14{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ano atual:");
        int ano_atual = sc.nextInt();

        System.out.println("Informe o ano de nascimento:");
        int ano_nasc = sc.nextInt();

        int id = (ano_atual-ano_nasc);

        if(id>=18){
            System.out.println("Pode votar! Idade: "+id+" Anos");
        }else{
            System.out.println("NÃO pode votar! Idade: "+id+ "Anos");
        }
    }
}