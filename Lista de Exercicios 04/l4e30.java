import java.util.Scanner;

public class l4e30{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n, ax=1, ay=1, fat=1, fatorial;
        float soma=0;

        System.out.println("Informe o número de termos a serem exibidos:");
        n = sc.nextInt();

        while(ax<=n){
            
            fatorial=fat;

            while(ay<fat){
                fatorial = (fatorial*ay);
                ay++;
            }
            System.out.println("S = "+ax+"/"+fatorial);
            soma = (soma+(fatorial/ax));
            fat = (fat+2);
            ay=1;
            ax++;
        }
        System.out.println("\nSoma da série: "+soma);
    }
}