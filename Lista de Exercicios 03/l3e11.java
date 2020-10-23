import java.util.Scanner;

public class l3e11{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int lp;
        float md, perimetro, area;

        System.out.println("Informe o número de lados de um polígono:");
        lp = sc.nextInt();

        System.out.println("Informe a medida em centimetros do lado do polígono:");
        md = sc.nextFloat();

        if(lp==3){
            perimetro = (md+md+md);
            System.out.println("Triângulo!\nPerimetro: "+perimetro);
        }
        else if(lp==4){
            area = (md*md);
            System.out.println("Quadrado!\nÁrea: "+area);
        }
        else if(lp==5){
            System.out.println("Pentágono!");
        }
    }
}