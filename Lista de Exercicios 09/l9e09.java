import java.util.Scanner;
import java.util.Random;

public class l9e09{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int[][] matriz = new int[5][5];
        int x, y, aux;
        char move = ' ';

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = rd.nextInt(10);

                if(matriz[i][j]==5){
                    matriz[i][j] = 1;
                }
            }
        }
        x = matriz.length/2;
        y = matriz[0].length/2;
        matriz[x][y] = 5;

        while(move!='0'){
            System.out.print("Matriz:\n");
            for(int i=0; i<matriz.length; i++){
                for(int j=0; j<matriz[i].length; j++){
                    System.out.print(matriz[i][j]+"\t");
                }
                System.out.println(" ");
            }
            System.out.println("Informe uma tecla [W-A-S-D] para movimentar o número 5 na matriz:");
            move = sc.next().charAt(0);

            switch(move){
                case 'W':
                    aux = matriz[x-1][y];
                    matriz[x-1][y] = matriz[x][y];
                    matriz[x][y] = aux;
                    x = (x-1);
                    break;

                case 'A':
                    aux = matriz[x][y-1];
                    matriz[x][y-1] = matriz[x][y];
                    matriz[x][y] = aux;
                    y = (y-1);
                    break;

                case 'S':
                    aux = matriz[x+1][y];
                    matriz[x+1][y] = matriz[x][y];
                    matriz[x][y] = aux;
                    x = (x+1);
                    break;

                case 'D':
                    aux = matriz[x][y+1];
                    matriz[x][y+1] = matriz[x][y];
                    matriz[x][y] = aux;
                    y = (y+1);
                    break;

                default:
                    System.out.println("Tecla de movimento inválida!");
            }
        }
    }
}