import java.util.Scanner;
import java.util.Random;

public class Ex06{

    static void printMatriz(int[][] matriz){
        System.out.println("MATRIZ:");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int[][] matriz = new int[5][5];
        int x = 0, y = 0, soma = 0;

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                matriz[i][j] = rd.nextInt(9);
            }
        }

        printMatriz(matriz);
    
        while((x<matriz.length)&&(y<matriz.length)&&(x>=0)&&(y>=0)){
            System.out.println("Informe uma linha da matriz:");
            x = sc.nextInt();

            System.out.println("Informe uma coluna da matriz:");
            y = sc.nextInt();

            for(int i=0; i<matriz.length; i++){
                soma = (soma+matriz[x][i]+matriz[i][y]);
            }
            soma = (soma-matriz[x][y]);

            System.out.println("Soma dos elementos da linha e coluna informadas: "+soma);

            soma=0;
        }
    }
}