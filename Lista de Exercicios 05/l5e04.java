import java.util.Scanner;

public class l5e04{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n=1, qnt;
        float valor=0, soma=0;

        System.out.println("Tabela:\n1-Hot Dog R$4.00\n2-X-Salada R$4.50\n3-X-Bacon R$5.00\n4-Torrada R$2.00\n5-Refrigerante R$1.50\n0-Finalizar");

        while(n!=0){
            System.out.println("Informe um produto:");
            n = sc.nextInt();

            if(n<=5){
                System.out.println("Informe a quantidade do item selecionado:");
                qnt = sc.nextInt();

                if(n==1){
                    valor = (qnt*4);
                }
                else if(n==2){
                    valor = (qnt*4.50f);
                }
                else if(n==3){
                    valor = (qnt*5);
                }
                else if(n==4){
                    valor = (qnt*2);
                }
                else if(n==5){
                    valor = (qnt*1.50f);
                }else{
                    System.out.println("Código do produto inválido!");
                }
                soma = (soma+valor);
            }
        }
        System.out.printf("Valor total do pedido: R$%.2f%n",soma);
    }
}