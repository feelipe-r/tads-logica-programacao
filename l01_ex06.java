import java.util.Scanner;

public class l01_ex06{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno:");
        double nt1 = sc.nextDouble();

        System.out.println("Informe a segunda nota do aluno:");
        double nt2 = sc.nextDouble();

        double media = ((nt1+nt2)/2);

        System.out.printf("Média do aluno %.2f %n", +media);
    }
}