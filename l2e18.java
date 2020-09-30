import java.util.Scanner;

public class l2e18{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário fixo do vendedor:");
        float sal_fix = sc.nextFloat();

        System.out.println("Informe o valor da comissão por cada carro vendido:");
        float coms = sc.nextFloat();

        System.out.println("Informe o total de carros vendidos:");
        int n_car = sc.nextInt();

        System.out.println("Informe o valor total de vendas:");
        float valor_vendas = sc.nextFloat();

        float coms_carros = (coms*n_car);
        float coms_vendas = (valor_vendas*0.05f);
        float sal_final = (sal_fix+coms_carros+coms_vendas);

        System.out.printf("Salário final do vendedor: R$ %.2f%n", sal_final);
    }
}