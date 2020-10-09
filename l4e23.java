import java.util.Scanner;

public class l4e23{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float massa, perda, tempo;
        int a=0;

        System.out.println("Informe a massa inicial em gramas do material radioativo:");
        massa = sc.nextFloat();

        perda = (massa*0.25f);

        while(massa>0.10f){
            massa = (massa-perda);
            a++;
        }
        tempo = (a*30);
        System.out.println("Tempo necessário para a massa se tornar inferior a 0.10 Gramas: "+tempo+" Segundos");
    }
}