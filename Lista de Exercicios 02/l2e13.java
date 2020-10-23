import java.util.Scanner;

public class l2e13{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a nota da primeira avaliação:");
        float n1 = sc.nextFloat();

        System.out.println("Informe a nota da segunda avaliação:");
        float n2 = sc.nextFloat();

        float media = ((n1+n2)/2);

        if(media>=6){
            System.out.printf("Aluno aprovado! Média: %.2f%n",media);
        }else{
            System.out.printf("Aluno reprovado! Média: %.2f%n",media);
        }
    }
}
