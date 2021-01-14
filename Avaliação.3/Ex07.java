import java.util.Scanner;

public class Ex07{

    static void printMatriz(int[][] matriz){
        System.out.println("MATRIZ:");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int x = 1, soma = 0;

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.println("Informe um numero para linha "+i+" e coluna "+j+" da matriz:");
                matriz[i][j] = sc.nextInt();
            }
        }
        printMatriz(matriz);

        while(x>0){
            System.out.println("Informe um numero:");
            x = sc.nextInt();

            for(int i=0; i<matriz.length; i++){
                for(int j=0; j<matriz[0].length; j++){
                    soma = (soma+matriz[i][j]);
                }
                if(x==soma){
                    System.out.println("A soma dos elementos da linha "+i+" eh igual ao numero informado");
                }
                soma=0;
            }
        }
    }
}