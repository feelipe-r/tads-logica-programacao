import java.util.Scanner;

public class l2e22{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número da conta do cliente:");
        String conta = sc.nextLine();

        System.out.println("Informe o saldo do cliente:");
        float saldo = sc.nextFloat();

        System.out.println("Informe o valor do débito:");
        float debito = sc.nextFloat();

        System.out.println("Informe o valor do crédito:");
        float credito = sc.nextFloat();

        float novo_saldo = (saldo-debito+credito);

        System.out.println("Número da conta: "+conta+"\nNovo saldo: "+novo_saldo);

        if(novo_saldo>0){
            System.out.println("Saldo positivo");
        }else{
            System.out.println("Saldo negativo");
        }
    }
}