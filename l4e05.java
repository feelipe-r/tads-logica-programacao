import java.util.Scanner;

public class l4e05{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n=1;
        float nota, soma=0, media=0;

        while(n<=5){
            System.out.println("Informe a nota "+n+" do aluno:");
            nota = sc.nextFloat();

            soma = (soma+nota);
            n++;
        }
        media = (soma/5);
        System.out.printf("Média do aluno: %.2f%n",media);
    }
}