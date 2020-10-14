import java.util.Scanner;

public class l5e10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n, x, y, soma=0;

        System.out.println("Informe o número de testes:");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("\nTeste: "+i);

            System.out.println("Informe o número inteiro X:");
            x = sc.nextInt();

            System.out.println("Informe o número inteiro Y:");
            y = sc.nextInt();

            if(x==y){
                soma = 0;
            }
            else if(x<y){
                for(int j=x+1; j<y; j++){
                    if(j%2!=0){
                        soma = (soma+j);
                    }
                }
            }else{
                for(int j=y+1; j<x; j++){
                    if(j%2!=0){
                        soma = (soma+j);
                    }
                }
            }
            System.out.println("Soma dos ímpares no intervalo entre [X][Y]: "+soma);
            soma=0;
        }
    }
}