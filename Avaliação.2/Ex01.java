import java.util.Scanner;

public class Ex01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char c;

        System.out.println("Informe uma letra:");
        c = sc.next().charAt(0);

        char x = Character.toLowerCase(c);

        switch(x){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("A letra informada eh uma vogal");
                break;

            default:
                System.out.println("A letra informada eh uma consoante");
        }
    }
}