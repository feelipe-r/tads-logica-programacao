import java.util.Scanner;

public class l7e04{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int id, valor=100;

        System.out.println("Informe a idade do conveniado:");
        id = sc.nextInt();

        if(id<10){
            valor = (valor+80);
            System.out.println("Valor a ser pago: R$"+valor);
        }
        else if((id>=10)&&(id<30)){
            valor = (valor+50);
            System.out.println("Valor a ser pago: R$"+valor);
        }
        else if((id>=30)&&(id<60)){
            valor = (valor+95);
            System.out.println("Valor a ser pago: R$"+valor);
        }else{
            valor = (valor+130);
            System.out.println("Valor a ser pago: R$"+valor);
        }
    }
}