import java.util.Scanner;

public class l2e20{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a marcação em Km do odômetro no inicio do dia:");
        float km_i = sc.nextFloat();

        System.out.println("Informe a marcação em Km do odômetro no fim do dia:");
        float km_f = sc.nextFloat();

        System.out.println("Informe em litros a quantidade gasta de combustível:");
        float gas = sc.nextFloat();

        System.out.println("Informe o valor total recebido dos passageiros:");
        float valor = sc.nextFloat();

        float km_r = (km_f-km_i);
        float media_c = (km_r/gas);
        float custo_gas = (gas*4.599f);
        float lucro = (valor-custo_gas);

        System.out.println("Média de consumo: "+media_c+"Km/L");
        System.out.println("Valor gasto em combustível: R$ " +custo_gas);
        System.out.println("Lucro líquido do dia: R$ " +lucro);   
    }
}