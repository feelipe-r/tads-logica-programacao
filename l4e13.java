import java.util.Scanner;

public class l4e13{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int aux=1, pos=0;
        float nota, soma=0, media, maior_nota=0;

        while(aux<=3){
            System.out.println("Informe a nota "+aux+" do aluno:");
            nota = sc.nextFloat();

            if(nota>maior_nota){
                maior_nota = nota;
                pos = aux;
            }
            soma = (soma+nota);
            aux++;
        }
        media = (soma/3);
        System.out.printf("Média do aluno: %.2f%n",media);
        System.out.println("Maior nota do aluno: "+maior_nota+"\nNota: "+pos);
    }
}