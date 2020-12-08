import java.util.Scanner;

public class l9e07{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int x, soma=0;

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.println("Informe um valor para linha "+i+" e coluna "+j+" da matriz:");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Informe o valor de x:");
        x = sc.nextInt();

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                soma = (soma+matriz[i][j]);
            }
            if(soma==x){
                System.out.println("Linha: "+i);
            }
            soma=0;
        }
    }
}