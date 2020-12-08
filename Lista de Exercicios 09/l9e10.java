import java.util.Scanner;
import java.util.Random;

public class l9e10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[][] matriz = new int[10][10];
        int[] vetor = new int[10];
        int r=0, x, y;

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = rd.nextInt(50);
            }
        }
        while(r<=3){
            System.out.println("===========================================================================");
            System.out.print("Matriz:\n");
            for(int i=0; i<matriz.length; i++){
                for(int j=0; j<matriz[i].length; j++){
                    System.out.print(matriz[i][j]+"\t");
                }
                System.out.println(" ");
            }
            switch(r){
                case 0:
                    x=1; y=7;
                    for(int i=0; i<matriz.length; i++){
                        vetor[i] = matriz[x][i];
                        matriz[x][i] = matriz[y][i];
                        matriz[y][i] = vetor[i];
                    }
                    break;
                case 1:
                    x=3; y=9;
                    for(int i=0; i<matriz[0].length; i++){
                        vetor[i] = matriz[i][x];
                        matriz[i][x] = matriz[i][y];
                        matriz[i][y] = vetor[i];
                    }
                    break;
                case 2:
                    x=0; y=matriz[0].length-1;
                    for(int i=0; i<matriz.length; i++){
                        vetor[i] = matriz[i][x];
                        matriz[i][x] = matriz[i][y];
                        matriz[i][y] = vetor[i];
                        x++;
                        y--;
                    }
            }
            r++;
            System.out.println("===========================================================================");
        }
    }
}