import java.util.Scanner;

public class l01_ex10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do ingresso:");
        double v = sc.nextDouble();

        System.out.println("Informe o número de pessoas sócias do clube:");
        int nsc = sc.nextInt();

        System.out.println("Informe o número de pessoas não pagantes:");
        int npg = sc.nextInt();

        System.out.println("Informe o número de pessoas pagantes:");
        int pp = sc.nextInt();

        int pblc_t = (nsc+npg+pp);

        double desc_soc = (v*0.30);
        double isn = ((desc_soc*nsc)+(v*npg));
        
        double vlr_nsc = ((v-desc_soc)*nsc); 
        double vlr_pp = (v*pp);
        
        double vlr_t = (vlr_nsc+vlr_pp);

        System.out.println("Publico total do evento: "+pblc_t);
        System.out.println("Renda total do evento: R$"+vlr_t);
        System.out.println("Valor que deixou de ser arrecadado: R$"+isn);
    }
}