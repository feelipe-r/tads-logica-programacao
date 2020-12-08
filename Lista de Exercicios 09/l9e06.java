import java.util.Scanner;

public class l9e06{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(i!=j){
                    System.out.println("Informe um número para linha "+i+" e coluna "+j+" da matriz:");
                    matriz[i][j] = sc.nextInt();
                }
            }
        }
        System.out.print("Matriz:\n");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}