import java.util.Scanner;

public class l7e10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int code;
        float valor, lucro;

        System.out.println("Informe o código do produto:\n[1]-Hortifruti\n[2]-Laticíneos\n[3]-Carnes\n[4]-Peixes\n[5]-Aves\n[6]-Ovos");
        code = sc.nextInt();

        System.out.println("Informe o preço de custo do produto:");
        valor = sc.nextFloat();

        switch(code){
            case 1:
            case 2:
                lucro = (valor*0.80f);
                valor = (valor+lucro);
                System.out.printf("Preço de venda do produto informado: R$ %.2f%n",valor);
                break;

            case 3:
            case 4:
                lucro = (valor*1f);
                valor = (valor+lucro);
                System.out.printf("Preço de venda do produto informado: R$ %.2f%n",valor);
                break;

            case 5:
            case 6:
                lucro = (valor*0.90f);
                valor = (valor+lucro);
                System.out.printf("Preço de venda do produto informado: R$ %.2f%n",valor);
                break;

            default:
                System.out.println("Código inválido");
        }
    }
}