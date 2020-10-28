import java.util.Scanner;

public class l7e12{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float valor, desc;
        int cat;

        System.out.println("Informe o valor total da compra:");
        valor = sc.nextFloat();

        System.out.println("Informe a categoria do comprador:\n[1]-Normal\n[2]-Funcionário\n[3]-Vip");
        cat = sc.nextInt();

        switch(cat){
            case 1:
                System.out.printf("Total a pagar: R$ %.2f%n",valor);
                break;

            case 2:
                desc = (valor*0.10f);
                valor = (valor-desc);
                System.out.printf("Total a pagar: R$ %.2f%n",valor);
                break;

            case 3:
                desc = (valor*0.05f);
                valor = (valor-desc);
                System.out.printf("Total a pagar: R$ %.2f%n",valor);
                break;

            default:
             System.out.println("Categoria inválida!");
        }
    }
}