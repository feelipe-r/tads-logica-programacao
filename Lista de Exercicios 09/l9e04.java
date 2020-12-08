import java.util.Scanner;
import java.util.Random;

public class l9e04{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int[][] matriz = new int[10][10];

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = rd.nextInt(100);
            }
        }
        System.out.print("Matriz:\n");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.print("Matriz só com elemntos acima da diagonal principal:\n");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(j>i){
                    System.out.print(matriz[i][j]+"\t");
                }
            }
            System.out.println(" ");
        }
    }
}