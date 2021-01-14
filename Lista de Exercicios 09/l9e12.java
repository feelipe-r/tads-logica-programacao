import java.util.Scanner;

public class l9e12{

    public static void printTab(char[][] matriz){
        System.out.print("Tabuleiro:\n");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print("|\t"+matriz[i][j]+"\t");
            }
            System.out.print("|\n\n");
        }
    }
    public static int checkLinhaColuna(char[][] matriz){
        for(int i=0; i<matriz.length; i++){
            if((matriz[i][0]=='X')&&(matriz[i][1]=='X')&&(matriz[i][2]=='X')||(matriz[0][i]=='X')&&(matriz[1][i]=='X')&&(matriz[2][i]=='X')){
                return 1;
            }
            else if((matriz[i][0]=='O')&&(matriz[i][1]=='O')&&(matriz[i][2]=='O')||(matriz[0][i]=='O')&&(matriz[1][i]=='O')&&(matriz[2][i]=='O')){
                return 2;
            }
        }
        return 0;
    }
    public static int checkDiagonal(char[][] matriz){
        if((matriz[0][0]=='X')&&(matriz[1][1]=='X')&&(matriz[2][2]=='X')||(matriz[2][0]=='X')&&(matriz[1][1]=='X')&&(matriz[0][2]=='X')){
            return 1;
        }
        else if((matriz[0][0]=='O')&&(matriz[1][1]=='O')&&(matriz[2][2]=='O')||(matriz[2][0]=='O')&&(matriz[1][1]=='O')&&(matriz[0][2]=='O')){
            return 2;
        }
        return 0;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char[][] tab = new char[3][3];
        int x, y, play = 0;

        System.out.println("Jogador 1 = X\nJogador 2 = O");

        while(play<5){
            System.out.println("Jogador 1:\nInforme uma linha e uma coluna para jogar:");
            x = sc.nextInt();
            y = sc.nextInt();

            while((x<0)||(x>2)){
                System.out.println("Linha invÃ¡lida! Informe uma nova linha:");
                x = sc.nextInt();
            }
            while((y<0)||(y>2)){
                System.out.println("Coluna invÃ¡lida! Informe uma nova coluna:");
                y = sc.nextInt();
            }
            while((tab[x][y]=='X')||(tab[x][y]=='O')){
                System.out.println("EspaÃ§o ocupado! Informe uma nova linha e coluna:");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            tab[x][y] = 'X';
            printTab(tab);
            
            if((checkLinhaColuna(tab)==1)||(checkDiagonal(tab)==1)){
                System.out.println("Jogador 1 venceu!");
                break;
            }
            if(play<4){
                System.out.println("Jogador 2:\nInforme uma linha e uma coluna para jogar:");
                x = sc.nextInt();
                y = sc.nextInt();

                while((x<0)||(x>2)){
                    System.out.println("Linha invÃ¡lida! Informe uma nova linha:");
                    x = sc.nextInt();
                }
                while((y<0)||(y>2)){
                    System.out.println("Coluna invÃ¡lida! Informe uma nova coluna:");
                    y = sc.nextInt();
                }
                while((tab[x][y]=='X')||(tab[x][y]=='O')){
                    System.out.println("EspaÃ§o ocupado! Informe uma nova linha e coluna:");
                    x = sc.nextInt();
                    y = sc.nextInt();
                }
                tab[x][y] = 'O';
                printTab(tab);

                if((checkLinhaColuna(tab)==2)||(checkDiagonal(tab)==2)){
                    System.out.println("Jogador 2 venceu!");
                    play = 5;
                    break;
                }
            }
            play++;
        }
        System.out.println("FIM DE JOGO!");
    }
}
