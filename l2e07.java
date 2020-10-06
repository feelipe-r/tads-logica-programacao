import java.util.Scanner;

public class l2e07{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor recebido por hora:");
        float sal_hora = sc.nextFloat();
         
        System.out.println("Informe o número de horas trabalhadas no mês:");
        int n_horas = sc.nextInt();

        float sal_atual = (sal_hora*n_horas);

        float imposto = ((sal_atual*15)/100);

        float sal_liquido = (sal_atual-imposto);

        System.out.println("Salário no mês: "+sal_atual);
        System.out.println("Salário líquido com desconto de 15% de impostos: "+sal_liquido);
    }
}
