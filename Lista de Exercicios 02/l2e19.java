import java.util.Scanner;

public class l2e19{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe em metros o comprimento da cozinha:");
        float comp = sc.nextFloat();

        System.out.println("Informe em metros a largura da cozinha:");
        float larg = sc.nextFloat();

        System.out.println("Informe em metros a altura da cozinha:");
        float alt = sc.nextFloat();

        float area = ((comp*2+larg*2)*alt);
        float cx = (area/1.5f);

        System.out.println("Área da cozinha: "+area+"M²");
        System.out.println("Quantidade de caixas de azulejos necessárias: "+cx);
    }
}