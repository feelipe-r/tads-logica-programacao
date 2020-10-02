import java.util.Scanner;

public class l2e23{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade do produto x em estoque:");
        int stock = sc.nextInt();

        System.out.println("Informe a quantidade máxima do produto x em estoque:");
        int stock_max = sc.nextInt();

        System.out.println("Informe a quantidade mínima do produto x em estoque:");
        int stock_min = sc.nextInt();

        float media_stock = ((stock_max+stock_min)/2);
        
        System.out.println("Quantidade média em estoque do produto x: "+media_stock);

        if(stock>=media_stock){
            System.out.println("Não efetuar compra!");
        }else{
            System.out.println("Efetuar compra!");
        }
    }
}