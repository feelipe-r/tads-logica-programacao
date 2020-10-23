import java.util.Scanner;

public class l6e07{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n, m=0, f=0;
        float slr, soma_m=0, soma_f=0, media_sm, media_sf, maior_sm=0, maior_sf=0;
        String nome, nome_m = " ", nome_f = " ";
        char sx;
        
        System.out.println("Informe o número de funcionários:");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Informe o nome do funcionário "+i+":");
            nome = sc.next();

            System.out.println("Informe o sexo do funcionário "+i+":\n[M]-Masculino\n[F]-Feminino");
            sx = sc.next().charAt(0);

            System.out.println("Informe o salário do funcionário "+i+":");
            slr = sc.nextFloat();

            if(sx=='M'){
                m++;
                soma_m = (soma_m+slr);
                if(slr>maior_sm){
                    maior_sm = slr;
                    nome_m = nome;
                }
            }
            else if(sx=='F'){
                f++;
                soma_f = (soma_f+slr);
                if(slr>maior_sf){
                    maior_sf = slr;
                    nome_f = nome;
                }
            }
        }
        media_sm = (soma_m/m);
        media_sf = (soma_f/f);
        System.out.println("Maior salário masculino: "+nome_m+" - Salário: R$"+maior_sm);
        System.out.println("Maior salário ferminino: "+nome_f+" - Salário: R$"+maior_sf);
        System.out.println("Média salarial masculina: "+media_sm+"\nMédia salarial feminina: "+media_sf);
    }
}