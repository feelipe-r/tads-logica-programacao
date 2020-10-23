import java.util.Scanner;

public class l2e25{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float s;

        System.out.println("Informe o valor de um produto x:");
        float valor = sc.nextFloat();

        System.out.println("Informe a quantidade de moedas de 1 real do cofrinho:");
        float m1 = sc.nextFloat();

        System.out.println("Informe a quantidade de moedas de 50 centavos do cofrinho:");
        float m50 = sc.nextFloat();

        System.out.println("Informe a quantidade de moedas de 25 centavos do cofrinho:");
        float m25 = sc.nextFloat();

        System.out.println("Informe a quantidade de moedas de 10 centavos do cofrinho:");
        float m10 = sc.nextFloat();

        System.out.println("Informe a quantidade de moedas de 05 centavos do cofrinho:");
        float m5 = sc.nextFloat();

        float cofre = ((m1*1)+(m50*0.50f)+(m25*0.25f)+(m10*0.10f)+(m5*0.05f));

        System.out.println("Valor contabilizado do cofrinho: "+cofre);

        if(cofre>valor){
            s = (cofre-valor);
            System.out.println("A compra do produto pode ser feita!\nSobra: R$"+s);
        }else{
            s = (valor-cofre);
            System.out.println("A compra do produto NÃO pode ser feita!\nFalta: R$"+s);
        }
    }
}