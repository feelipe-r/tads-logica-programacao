import java.util.Scanner;

public class l9e02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t;

        System.out.println("Informe o tamnho da matriz quadrada:");
        t = sc.nextInt();

        int[][] matriz = new int[t][t];

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if((i%2==0)&&(j%2==0)){
                    matriz[i][j] = 0;
                }else if((i%2!=0)&&(j%2!=0)){
                    matriz[i][j] = 0;
                }else{
                    matriz[i][j] = 1;
                }
            }
        }
        System.out.print("Matriz:\n");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}