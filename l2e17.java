import java.util.Scanner;

public class l2e17{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o custo de fábrica do carro:");
        float custo_fab = sc.nextFloat();

        float porc_dist = (custo_fab*0.28f);
        float imposto = (custo_fab*0.45f);

        float custo_final = (custo_fab+porc_dist+imposto);

        System.out.printf("Valor do distribuidor: R$ %.2f%n", porc_dist);
        System.out.printf("Valor dos impostos: R$ %.2f%n", imposto);
        System.out.printf("Custo final do carro: R$ %.2f%n", custo_final);
    }
}