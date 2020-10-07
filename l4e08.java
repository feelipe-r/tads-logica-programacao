import java.util.Scanner;

public class l4e08{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int total_m, aux=1;
        float valor, soma=0, media;

        System.out.println("Informe o total de mercadorias no estoque da loja:");
        total_m = sc.nextInt();

        while(aux<=total_m){
            System.out.println("Informe o valor da mercadoria "+aux+":");
            valor = sc.nextFloat();

            soma = (soma+valor);
            aux++;
        }
        media = (soma/total_m);
        System.out.printf("Valor total em estoque de mercadorias: R$%.2f%n",soma);
        System.out.printf("Média dos valores das mercadorias: R$%.2f%n",media);
    }
}