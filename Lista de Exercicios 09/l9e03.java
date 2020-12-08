import java.util.Scanner;

public class l9e03{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[10][10];

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.println("Informe um número para linha "+i+" e coluna "+j+" da matriz:");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("Matriz:\n");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.print("Matriz sem a diagonal principal:\n");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(i!=j){
                    System.out.print(matriz[i][j]+" ");
                }
            }
            System.out.println(" ");
        }
    }
}