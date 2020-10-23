import java.util.Scanner;

public class l6e13{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float x, y, tx_x, tx_y;
        int a=0;

        System.out.println("Informe o número de habitantes do país A:");
        x = sc.nextInt();

        System.out.println("Informe o número de habitantes do país B:");
        y = sc.nextInt();

        tx_x = (x*0.03f);
        tx_y = (y*0.015f);

        while(x<y){
            x = (x+tx_x);
            y = (y+tx_y);
            a++;
        }
        System.out.println("Anos necessários para o país A ultrapassar o B em número de habitantes: "+a);
    }
}