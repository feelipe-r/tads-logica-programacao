import java.util.Scanner;

public class l9e08{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int aux=0, somaLinha=0, somaColuna=0, somaDiag1=0, somaDiag2=0,x=matriz.length-1, a=0;

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.println("Informe um número para linha "+i+" e coluna "+j+" da matriz:");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("Matriz:\n");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println(" ");
        }
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(i==j){
                    somaDiag1 = (somaDiag1+matriz[i][j]);
                }
            }
        }
        for(int i=0; i<matriz.length; i++){
            somaDiag2 = (somaDiag2+matriz[i][x]);
            x--;
        }
        while(aux<matriz.length){
            for(int i=0; i<matriz.length; i++){
                somaLinha = (somaLinha+matriz[a][i]);
                somaColuna = (somaColuna+matriz[i][a]);
            }
            if((somaLinha==somaColuna)&&(somaColuna==somaDiag1)&&(somaDiag1==somaDiag2)){
                aux++;
                a++;
                somaLinha=0;
                somaColuna=0;
                continue;
            }else{
                System.out.println("Não é quadrado perfeito!");
                break;
            }
        }
        if(aux==matriz.length){
            System.out.println("Quadrado perfeito!");
        }
    }
}