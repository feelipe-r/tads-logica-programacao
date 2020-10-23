import java.util.Scanner;

public class l2e21{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o comprimento em metros da pista:");
        float comp_pista = sc.nextFloat();

        comp_pista = (comp_pista/1000);

        System.out.println("Informe o número total de voltas na pista:");
        int n_voltas = sc.nextInt();

        System.out.println("Informe o número de reabastecimentos desejados:");
        int n_fuel = sc.nextInt();

        System.out.println("Informe o consumo de combustível do carro em Km/L:");
        float cons_comb = sc.nextFloat();

        float abast = (n_voltas/n_fuel);
        float dist = (abast*comp_pista);
        float litros = (dist/cons_comb);

        System.out.println("Número mínimo de litros necessários para percorrer até o primeiro reabastecimento: "+litros+"L");
    }
}