import java.util.Scanner;

public class l01_ex07{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a distância em Km do trajeto percorrido:");
        double dst = sc.nextDouble();

        System.out.println("Informe a velocidade média em Km/h da viagem:");
        double vel = sc.nextDouble();

        double tmp = (dst/vel);

        System.out.println("Tempo de viagem: "+tmp+"h");
    }
}