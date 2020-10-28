import java.util.Scanner;

public class l7e06{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        char l;

        System.out.println("Informe uma letra:");
        l = sc.next().charAt(0);

        switch(l){
            case 'M':
            case 'm':
                System.out.println("Masculino");
                break;

            case 'F':
            case 'f':
                System.out.println("Feminino");
                break;

            default:
                System.out.println("Letra inválida");
        }
    }
}