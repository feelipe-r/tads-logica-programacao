import java.util.Scanner;

public class l3e14{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, nota3, media;

        System.out.println("Informe as três notas do aluno:");
        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat();
        nota3 = sc.nextFloat();

        media = ((nota1+nota2+nota3)/3);

        if(media>=9){
            System.out.println("A");
        }
        else if((media<9)&&(media>=7.5f)){
            System.out.println("B");
        }
        else if((media<7.5f)&&(media>=6)){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}