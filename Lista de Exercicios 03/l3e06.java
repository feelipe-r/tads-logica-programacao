import java.util.Scanner;

public class l3e06{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String time_a, time_b;
        int gol_a, gol_b;

        System.out.println("Informe o nome dos dois times que disputam a partida:");
        time_a = sc.nextLine();
        time_b = sc.nextLine();

        System.out.println("Informe o número de gols do primeiro time:");
        gol_a = sc.nextInt();

        System.out.println("Informe o número de gols do segundo time:");
        gol_b = sc.nextInt();

        if(gol_a>gol_b){
            System.out.println("Time vencedor: "+time_a);
        }else{
            if(gol_a==gol_b){
                System.out.println("EMPATE!");
            }else{
                System.out.println("Time vencedor: "+time_b);
            }
        }
    }
}