import java.util.Scanner;

public class l4e22{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a=0;
        float x, y, nat_a, nat_b;

        System.out.println("Informe o número de habitntes do país A:");
        x = sc.nextFloat();

        nat_a = (x*0.03f);

        System.out.println("Informe o númro de habitantes do país B:");
        y = sc.nextFloat();

        nat_b = (y*0.02f);

        while(x<y){
            x = (x+nat_a);
            y = (y+nat_b);
            a++;
        }
        System.out.println("Tempo necessário para população do país A ultrapassar a de B: "+a+" Anos");
    }
}