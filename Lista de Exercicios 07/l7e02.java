import java.util.Scanner;

public class l7e02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int m, a;

        System.out.println("Informe um mês:");
        m = sc.nextInt();

        System.out.println("Informe o ano:");
        a = sc.nextInt();

        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 dias");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 dias");
                break;

            case 2:
                if((a%4==0)&&(a%100!=0)||(a%400==0)){
                    System.out.println("29 dias");
                }else{
                    System.out.println("28 dias");
                }
                break;

            default:
                System.out.println("Mês inválido");
        }
    }
}