import java.util.Scanner;

public class l4e17{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n_emp, n_horas, h_extra, aux=1;
        float valor_h, valor_e, pag_bruto;

        System.out.println("Informe o número de empregados na semana:");
        n_emp = sc.nextInt();

        while(aux<=n_emp){
            System.out.println("Informe o valor pago por hora do funcionário "+aux+":");
            valor_h = sc.nextFloat();

            System.out.println("Informe o número de horas trabalhadas pelo funcionário durante a semana:");
            n_horas = sc.nextInt();

            if(n_horas>40){
                h_extra = (n_horas-40);
                valor_e = (valor_h*1.5f);

                pag_bruto = ((40*valor_h)+(h_extra*valor_e));
                System.out.println("Pagamento bruto para o empregado "+aux+": R$"+pag_bruto);
            }else{
                pag_bruto = (n_horas*valor_h);
                System.out.println("Pagamento bruto para o empregado "+aux+": R$"+pag_bruto);
            }
            aux++;
        }
    }
}