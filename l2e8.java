import java.util.Scanner;

public class l2e8{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número total de eleitores do município:");
        int n_eleitores = sc.nextInt();

        System.out.println("Informe o número de votos válidos:");
        int v_validos = sc.nextInt();

        System.out.println("Informe o número de votos em branco:");
        int v_brancos = sc.nextInt();

        System.out.println("Informe o número de votos nulos:");
        int v_nulos = sc.nextInt();

        float porc_validos = ((v_validos*100)/n_eleitores);
        float porc_brancos = ((v_brancos*100)/n_eleitores);
        float porc_nulos = ((v_nulos*100)/n_eleitores);

        System.out.printf("Porcentagem de votos válidos: %.1f%n", porc_validos);
        System.out.printf("Porcentagem de votos brancos: %.1f%n", porc_brancos);
        System.out.printf("Porcentagem de votos nulos: %.1f%n", porc_nulos);
    }
}