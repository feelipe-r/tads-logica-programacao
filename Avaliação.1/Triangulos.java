import java.util.Scanner;

public class Triangulos{
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        int ang_a, ang_b, ang_c;

        System.out.println("Informe os tres angulos do triangulo:");
        ang_a = in.nextInt();
        ang_b = in.nextInt();
        ang_c = in.nextInt();

        if((ang_a==90)||(ang_b==90)||(ang_c==90)){
            System.out.println("Triangulo retangulo!");
        }
        else if((ang_a>90)||(ang_b>90)||(ang_c>90)){
            System.out.println("Triangulo obtusangulo!");
        }
        else if((ang_a<90)&&(ang_b<90)&&(ang_c<90)){
            System.out.println("Triangulo acutangulo!");
        }
    }  
}