import java.util.Scanner;

public class l5e08{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n;
        float valor, soma=0, media;

        System.out.println("Informe o número de testes:");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("\nTeste: "+i);
            
            for(int j=1; j<=3; j++){
                System.out.println("Informe o valor "+j+":");
                valor = sc.nextFloat();

                soma = (soma+valor);
            }
            media = (soma/3);
            System.out.printf("Média: %.2f%n",media);
            soma=0;
        }
    }
}