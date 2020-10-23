import java.util.Scanner;

public class l2e15{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a hora de inicio do jogo:");
        int hi = sc.nextInt();

        System.out.println("Informe a hora do término do jogo:");
        int hf = sc.nextInt();

        int time = (hf-hi);

        if(time<0){
            int hr = (time+24);
            System.out.println("O jogo durou "+hr+" Horas");
        }else{
            System.out.println("O jogo durou "+time+" Horas");
        }
    }
}