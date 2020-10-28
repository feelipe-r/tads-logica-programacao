import java.util.Scanner;

public class l7e07{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        char turno;

        System.out.println("Informe o turno de estudo:\n[M]-Matutino\n[V]-Vesperino\n[N]-Noturno");
        turno = sc.next().charAt(0);

        switch(turno){
            case 'M':
                System.out.println("Bom dia!");
                break;

            case 'V':
                System.out.println("Boa tarde!");
                break;

            case 'N':
                System.out.println("Boa noite!");
                break;

            default:
                System.out.println("Turno inválido!");
        }
    }
}

