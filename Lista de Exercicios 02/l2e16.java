import java.util.Scanner;

public class l2e16{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do salário:");
        float sal = sc.nextFloat();

        System.out.println("Informe o valor do empréstimo:");
        float emp = sc.nextFloat();

        System.out.println("Informe o número de prestações:");
        int n_parc = sc.nextInt();

        float valor_parc = (emp/n_parc);
        float porc_sal = (sal*0.30f);

        if(valor_parc>porc_sal){
            System.out.println("O empréstimo não pode ser realizado\nValor da parcela: "+valor_parc+"\n30% do salário: "+porc_sal);
        }else{
            System.out.println("O empréstimo pode ser realizado\nValor da parcela: "+valor_parc+"\n30% do salário: "+porc_sal);
        }
    }
}