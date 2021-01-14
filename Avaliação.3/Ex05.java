import java.util.Scanner;

public class Ex05{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        char[][] matriz = new char[30][5];
        char[] gabarito = new char[5];
        int[] resultado = new int[matriz.length];
        int score = 0;
        
        System.out.println("Informe o gabarito  [A-B-C-D]:");
        for(int i=0; i<gabarito.length; i++){
            gabarito[i] = sc.next().charAt(0);
        }
        System.out.println("Alternativas: [A-B-C-D-N]");
        for(int i=0; i<matriz.length; i++){
            System.out.println("Respostas do aluno "+(i+1)+":");
            for(int j=0; j<matriz[0].length; j++){
                System.out.println("Informe a resposta da questao "+(j+1)+":");
                matriz[i][j] = sc.next().charAt(0);

                if(matriz[i][j]==gabarito[j]){
                    score = (score+2);
                }
                else if(matriz[i][j]=='N'){
                    continue;
                }
                else{
                    score = (score-1);
                }
                resultado[i] = score;

                if(resultado[i]<0){
                    resultado[i] = 0;
                }
            }
            score = 0;
        }
        System.out.print("Gabarito:\n[");
        for(int i=0; i<gabarito.length; i++){
            if(i==gabarito.length-1){
                System.out.print(gabarito[i]+"]");
            }else{
                System.out.print(gabarito[i]+" ");
            }
        }
        System.out.println("\nResultado:");
        for(int i=0; i<matriz.length; i++){
            System.out.print("Aluno "+(i+1)+": \n|");
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j]+"|");
            }
            System.out.print(" - Pontos: "+resultado[i]);
            System.out.println(" ");
        }
    }
}