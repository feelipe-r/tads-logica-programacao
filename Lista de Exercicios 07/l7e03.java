import java.util.Scanner;

public class l7e03{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int d;

        System.out.println("Informe um dia da semana:");
        d = sc.nextInt();

        if((d==1)||(d==7)){
            System.out.println("Fim de semana");
        }
        else if((d>1)&&(d<7)){
            System.out.println("Dia de semana");
        }else{
            System.out.println("Dia inválido");
        }
    }
}