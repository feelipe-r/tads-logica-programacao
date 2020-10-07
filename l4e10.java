import java.util.Scanner;

public class l4e10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float salario;

        System.out.println("Informe o salário:");
        salario = sc.nextFloat();

        while((salario<400)||(salario>9999)){
            System.out.println("Salário inválido! Informe um novo salário:");
            salario = sc.nextFloat();
        }
        System.out.println("Salário lido: "+salario);
    }
}