import java.util.Scanner;

public class Ex02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int mounth;

        System.out.println("Informe o numero do mes:");
        mounth = sc.nextInt();

        switch(mounth){
            case 1:
            case 2:
            case 3:
                System.out.println("Primeiro trimestre");
                break;
            
            case 4:
            case 5:
            case 6:
                System.out.println("Segundo trimestre");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("Terceiro trimestre");
                break;

            case 10:
            case 11:
            case 12:
                System.out.println("Quarto trimestre");
                break;

            default:
                System.out.println("Mes invalido!");
        }
    }
}