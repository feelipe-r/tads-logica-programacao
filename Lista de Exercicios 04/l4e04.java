import java.util.Scanner;

public class l4e04{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        char x = 'A';
        float saldo=0, saque, deposito;
        
        while(x!='D'){
            System.out.println("Informe uma opção:\n[A]-Consulta saldo\n[B]-Saque\n[C]-Depósito\n[D]-Sair");
            x = sc.next().charAt(0);

            if(x=='A'){
                System.out.println("Saldo: "+saldo);
            }
            else if(x=='B'){
                System.out.println("Informe o valor do saque:");
                saque = sc.nextFloat();

                saldo = (saldo-saque);
            }
            else if(x=='C'){
                System.out.println("Informe o valor do depósito:");
                deposito = sc.nextFloat();

                saldo = (saldo+deposito);
            }
            else if(x=='D'){
                x = 'D';
            }else{
                System.out.println("Opção inválida!");
            }
        }
    }
}