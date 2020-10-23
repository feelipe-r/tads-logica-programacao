import java.util.Scanner;

public class l6e11{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int linha, coluna;

        System.out.println("Informe um número inteiro para linhas:");
        linha = sc.nextInt();

        System.out.println("Informe um número inteiro para colunas:");
        coluna = sc.nextInt();

        for(int i=0;  i<linha; i++){
            for(int j=0; j<coluna; j++){
                System.out.print("* "); //colunas
            }
            System.out.println(); //linhas
        }
    }
}