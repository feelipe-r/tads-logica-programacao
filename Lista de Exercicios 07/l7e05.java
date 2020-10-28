import java.util.Scanner;

public class l7e05{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float valor, juros=0.05f, multa;
        int m, aux=1;

        System.out.println("Informe o valor da anuidade:");
        valor = sc.nextFloat();

        System.out.println("Informe o mês de pagamento:");
        m = sc.nextInt();

        switch(m){
            case 1:
                System.out.printf("Valor do pagamento: R$ %.2f%n",valor);
                break;

            case 2:
                while(aux<m){
                    multa = (valor*juros);
                    valor = (valor+multa);
                    aux++;
                }
                System.out.printf("Valor do pagamento: R$ %.2f%n",valor);
                break;

            case 3:
                while(aux<m){
                    multa = (valor*juros);
                    valor = (valor+multa);
                    aux++;
                }
                System.out.printf("Valor do pagamento: R$ %.2f%n",valor);
                break;

            case 4:
                while(aux<m){
                    multa = (valor*juros);
                    valor = (valor+multa);
                    aux++;
                }
                System.out.printf("Valor do pagamento: R$ %.2f%n",valor);
                break;

            case 5:
                while(aux<m){
                    multa = (valor*juros);
                    valor = (valor+multa);
                    aux++;
                }
                System.out.printf("Valor do pagamento: R$ %.2f%n",valor);
                break;

            case 6:
                while(aux<m){
                    multa = (valor*juros);
                    valor = (valor+multa);
                    aux++;
                }
                System.out.printf("Valor do pagamento: R$ %.2f%n",valor);
                break;

            case 7:
                while(aux<m){
                    multa = (valor*juros);
                    valor = (valor+multa);
                    aux++;
                }
                System.out.printf("Valor do pagamento: R$ %.2f%n",valor);
                break;

            case 8:
                while(aux<m){
                    multa = (valor*juros);
                    valor = (valor+multa);
                    aux++;
                }
                System.out.printf("Valor do pagamento: R$ %.2f%n",valor);
                break;

            case 9:
                while(aux<m){
                    multa = (valor*juros);
                    valor = (valor+multa);
                    aux++;
                }
                System.out.printf("Valor do pagamento: R$ %.2f%n",valor);
                break;

            case 10:
                while(aux<m){
                    multa = (valor*juros);
                    valor = (valor+multa);
                    aux++;
                }
                System.out.printf("Valor do pagamento: R$ %.2f%n",valor);
                break;

            case 11:
                while(aux<m){
                    multa = (valor*juros);
                    valor = (valor+multa);
                    aux++;
                }
                System.out.printf("Valor do pagamento: R$ %.2f%n",valor);
                break;

            case 12:
                while(aux<m){
                    multa = (valor*juros);
                    valor = (valor+multa);
                    aux++;
                }
                System.out.printf("Valor do pagamento: R$ %.2f%n",valor);
                break;

            default:
                System.out.println("Mês inválido");
        }
    }
}