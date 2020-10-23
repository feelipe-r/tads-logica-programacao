import java.util.Scanner;

public class l5e13{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int t, n, c, v, pares, soma=0, n_retang;

        System.out.println("Informe o número de testes:");
        t = sc.nextInt();

        for(int i=1; i<=t; i++){
            System.out.println("Teste: "+i);

            System.out.println("Informe o número de varetas com tamanhos diferentes:");
            n = sc.nextInt();

            for(int j=1; j<=n; j++){
                System.out.println("Informe o comprimento da vareta "+j+":");
                c = sc.nextInt();

                System.out.println("Informe o número de varetas com o mesmo comprimento:");
                v = sc.nextInt();

                pares = (v/2);
                soma = (soma+pares);
            }
            n_retang = (soma/2);
            System.out.println("Número de retângulos que podem ser formados com o conjunto de varetas: "+n_retang);
            soma=0;
            System.out.println("==========================================================================");
        }
    }
}