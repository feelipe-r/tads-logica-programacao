import java.util.Scanner;

public class l01_ex08{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número total de eleitores:");
        int ne = sc.nextInt();

        System.out.println("Informe o número de votos válidos:");
        int nvv = sc.nextInt();

        System.out.println("Informe o número de votos brancos:");
        int nvb = sc.nextInt();

        System.out.println("Informe o número de votos nulos:");
        int nvn = sc.nextInt();

        double p_vv = (nvv*100/ne);
        double p_vb = (nvb*100/ne);
        double p_vn = (nvn*100/ne);

        System.out.println("Porcentual de votos válidos: "+p_vv+"%");
        System.out.println("Porcentual de votos brancos: "+p_vb+"%");
        System.out.println("Porcentual de votos nulos: "+p_vn+"%");
    }
}