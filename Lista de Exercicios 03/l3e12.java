import java.util.Scanner;

public class l3e12{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int lp;
        float md, perimetro, area;

        System.out.println("Informe o número de lados de um polígono:");
        lp = sc.nextInt();

        System.out.println("Informe a medida em centimetros do lado do polígono:");
        md = sc.nextFloat();

        if(lp<3){
            System.out.println("Não é um polígono!");
        }
        else if(lp==3){
            perimetro = (md+md+md);
            System.out.println("Triângulo!\nPerimetro: "+perimetro);
        }
        else if(lp==4){
            area = (md*md);
            System.out.println("Quadrado!\nÁrea: "+area);
        }
        else if(lp==5){
            System.out.println("Pentágono!");
        }else{
            System.out.println("Polígono não identificado!");
        }
    }
}