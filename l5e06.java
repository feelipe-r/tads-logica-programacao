import java.util.Scanner;

public class l5e06{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float x, y;

        System.out.println("Informe o valor de X:");
        x = sc.nextFloat();

        System.out.println("Informe o valor de Y:");
        y = sc.nextFloat();

        if((x>0)&&(y>0)){
            System.out.println("Quadrante 1");
        }
        else if((x<0)&&(y>0)){
            System.out.println("Quadrante 2");
        }
        else if((x<0)&&(y<0)){
            System.out.println("Quadrante 3");
        }
        else if((x>0)&&(y<0)){
            System.out.println("Quadrante 4");
        }else{
            System.out.println("Origem");
        }
    }
}