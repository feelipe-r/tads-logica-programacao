import java.util.Scanner;

public class l3e07{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        char tp;
        int lt;
        float desc, valor, r;

        System.out.println("Informe o número de litros:");
        lt = sc.nextInt();

        System.out.println("Informe o tipo de combustível:\n[A]-Álcool\n[G]-Gasolina");
        tp = sc.next().charAt(0);

        if(tp=='A'){
            if(lt<=20){
                desc = (3.90f*0.03f);
                valor = (3.90f-desc);
                r = (lt*valor);
            }else{
                desc = (3.90f*0.05f);
                valor = (3.90f-desc);
                r = (lt*valor);
            }
            System.out.printf("Valor a ser pago pelo combustível: R$ %.2f%n",r);
        }
        else if(tp=='G'){
            if(lt<=20){
                desc = (4.30f*0.04f);
                valor = (4.30f-desc);
                r = (lt*valor);
            }else{
                desc = (4.30f*0.06f);
                valor = (4.30f-desc);
                r = (lt*valor);
            }
            System.out.printf("Valor a ser pago pelo combustível: R$ %.2f%n",r);
        }
    }
}