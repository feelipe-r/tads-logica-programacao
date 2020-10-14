import java.util.Scanner;

public class l5e05{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float nota, soma=0, media, n_ex;

        for(int i=1; i<=4; i++){
            System.out.println("Informe a nota "+i+" do aluno:");
            nota = sc.nextFloat();

            soma = (soma+nota);
        }
        media = (soma/4);

        if(media>=7){
            System.out.printf("Aluno aprovado! - Média: %.2f%n",media);
        }
        else if(media<5){
            System.out.printf("Aluno reprovado! - Média: %.2f%n",media);
        }else{
            System.out.printf("Aluno em exame! - Média: %.2f%n",media);
            
            System.out.println("Informe a nota do exame:");
            n_ex = sc.nextFloat();

            media = ((media+n_ex)/2);

            if(media>=5){
                System.out.printf("Aluno aprovado! - Média final: %.2f%n",media);
            }else{
                System.out.printf("Aluno reprovado! - Média final: %.2f%n",media);
            }
        }
    }
}