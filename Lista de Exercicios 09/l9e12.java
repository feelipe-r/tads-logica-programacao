import java.util.Scanner;

public class l9e12{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char[][] tab = new char[3][3];
        int x, y, play = 0;

        System.out.println("Jogador 1 = X\nJogador 2 = O");

        while(play<5){
            System.out.println("Jogador 1:\nInforme uma linha e uma coluna para jogar:");
            x = sc.nextInt();

            while((x<0)||(x>2)){
                System.out.println("Linha inválida! Informe uma nova linha:");
                x = sc.nextInt();
            }

            y = sc.nextInt();

            while((y<0)||(y>2)){
                System.out.println("Coluna inválida! Informe uma nova coluna:");
                y = sc.nextInt();
            }
            while((tab[x][y]=='X')||(tab[x][y]=='O')){
                System.out.println("Espaço ocupado! Informe uma nova linha e coluna:");
                x = sc.nextInt();
                y = sc.nextInt();
            }

            tab[x][y] = 'X';

            System.out.print("Tabuleiro:\n");
            for(int i=0; i<tab.length; i++){
                for(int j=0; j<tab[0].length; j++){
                    System.out.print("|\t"+tab[i][j]+"\t");
                }
                System.out.print("|\n\n");
            }
            for(int i=0; i<tab.length; i++){
                if((tab[i][0]=='X')&&(tab[i][1]=='X')&&(tab[i][2]=='X')){
                    System.out.println("Jogador 1 venceu!");
                    play = 5;
                    break;
                }
                else if((tab[i][0]=='O')&&(tab[i][1]=='O')&&(tab[i][2]=='O')){
                    System.out.println("Jogador 2 venceu!");
                    play = 5;
                    break;
                }
            }
            for(int i=0; i<tab.length; i++){
                if((tab[0][i]=='X')&&(tab[1][i]=='X')&&(tab[2][i]=='X')){
                    System.out.println("Jogador 1 venceu!");
                    play = 5;
                    break;
                }
                else if((tab[0][i]=='O')&&(tab[1][i]=='O')&&(tab[2][i]=='O')){
                    System.out.println("Jogador 2 venceu!");
                    play = 5;
                    break;
                }
            }
            if((tab[0][0]=='X')&&(tab[1][1]=='X')&&(tab[2][2]=='X')){
                System.out.println("Jogador 1 venceu!");
                play = 5;
                break;
            }
            else if((tab[0][0]=='O')&&(tab[1][1]=='O')&&(tab[2][2]=='O')){
                System.out.println("Jogador 2 venceu!");
                play = 5;
                break;
            }
            if((tab[0][2]=='X')&&(tab[1][1]=='X')&&(tab[2][0]=='X')){
                System.out.println("Jogador 1 venceu!");
                play = 5;
                break;
            }
            else if((tab[0][0]=='O')&&(tab[1][1]=='O')&&(tab[2][2]=='O')){
                System.out.println("Jogador 2 venceu!");
                play = 5;
                break;
            }
            
            if(play<4){

                System.out.println("Jogador 2:\nInforme uma linha e uma coluna para jogar:");
                x = sc.nextInt();

                while((x<0)||(x>2)){
                    System.out.println("Linha inválida! Informe uma nova linha:");
                    x = sc.nextInt();
                }

                y = sc.nextInt();

                while((y<0)||(y>2)){
                    System.out.println("Coluna inválida! Informe uma nova coluna:");
                    y = sc.nextInt();
                }

                while((tab[x][y]=='X')||(tab[x][y]=='O')){
                    System.out.println("Espaço ocupado! Informe uma nova linha e coluna:");
                    x = sc.nextInt();
                    y = sc.nextInt();
                }

                tab[x][y] = 'O';

                System.out.print("Tabuleiro:\n");
                for(int i=0; i<tab.length; i++){
                    for(int j=0; j<tab[0].length; j++){
                        System.out.print("|\t"+tab[i][j]+"\t");
                    }
                    System.out.print("|\n\n");
                }
                for(int i=0; i<tab.length; i++){
                    if((tab[i][0]=='X')&&(tab[i][1]=='X')&&(tab[i][2]=='X')){
                        System.out.println("Jogador 1 venceu!");
                        play = 5;
                        break;
                    }
                    else if((tab[i][0]=='O')&&(tab[i][1]=='O')&&(tab[i][2]=='O')){
                        System.out.println("Jogador 2 venceu!");
                        play = 5;
                        break;
                    }
                }
                for(int i=0; i<tab.length; i++){
                    if((tab[0][i]=='X')&&(tab[1][i]=='X')&&(tab[2][i]=='X')){
                        System.out.println("Jogador 1 venceu!");
                        play = 5;
                        break;
                    }
                    else if((tab[0][i]=='O')&&(tab[1][i]=='O')&&(tab[2][i]=='O')){
                        System.out.println("Jogador 2 venceu!");
                        play = 5;
                        break;
                    }
                }
                if((tab[0][0]=='X')&&(tab[1][1]=='X')&&(tab[2][2]=='X')){
                    System.out.println("Jogador 1 venceu!");
                    play = 5;
                    break;
                }
                else if((tab[0][0]=='O')&&(tab[1][1]=='O')&&(tab[2][2]=='O')){
                    System.out.println("Jogador 2 venceu!");
                    play = 5;
                    break;
                }
                if((tab[0][2]=='X')&&(tab[1][1]=='X')&&(tab[2][0]=='X')){
                    System.out.println("Jogador 1 venceu!");
                    play = 5;
                    break;
                }
                else if((tab[0][0]=='O')&&(tab[1][1]=='O')&&(tab[2][2]=='O')){
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