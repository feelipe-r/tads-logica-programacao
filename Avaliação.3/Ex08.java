import java.util.Scanner;

public class Ex08{

    static void printMatriz(int[][] matriz){
        System.out.println("MATRIZ:");
        System.out.println("=================================");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("=================================");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int l = 2, c = 2, aux;
        char op = ' ';

        matriz[l][c] = 5;
      
        while(op!='F'){
            printMatriz(matriz);

            System.out.println("\nInforme [W-A-S-D] para movimentar o numero 5 na matriz e F para sair");
            op = sc.next().charAt(0);

            switch(op){
                case 'W':
                    if(l>0){
                        aux = matriz[l-1][c];
                        matriz[l-1][c] = matriz[l][c];
                        matriz[l][c] = aux;
                        l--;
                    }else{
                        l = 0;
                        System.out.println("\nImpossivel realizar movimento");
                    }
                    break;

                case 'A':
                    if(c>0){
                        aux = matriz[l][c-1];
                        matriz[l][c-1] = matriz[l][c];
                        matriz[l][c] = aux;
                        c--;
                    }else{
                        c = 0;
                        System.out.println("\nImpossivel realizar movimento");
                    }
                    break;

                case 'S':
                    if(l<matriz.length-1){
                        aux = matriz[l+1][c];
                        matriz[l+1][c] = matriz[l][c];
                        matriz[l][c] = aux;
                        l++;
                    }else{
                        l = matriz.length-1;
                        System.out.println("\nImpossivel realizar movimento");
                    }
                    break;

                case 'D':
                    if(c<matriz.length-1){
                        aux = matriz[l][c+1];
                        matriz[l][c+1] = matriz[l][c];
                        matriz[l][c] = aux;
                        c++;
                    }else{
                        c = matriz[0].length-1;
                        System.out.println("\nImpossivel realizar movimento");
                    }
                    break;

                case 'F':
                    break;

                default:
                    System.out.println("\nMovimento invalido!");
            }
            System.out.println(" ");
        }
    }
}