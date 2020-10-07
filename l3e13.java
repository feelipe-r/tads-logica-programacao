import java.util.Scanner;

public class l3e13{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String nome;
        int qnt;
        float vlr, total, desc, vl;

        System.out.println("Informe o nome do produto:");
        nome = sc.nextLine();

        System.out.println("Informe a quantidade adquirida:");
        qnt = sc.nextInt();

        System.out.println("Informe o valor unitário:");
        vlr = sc.nextFloat();

        total = (qnt*vlr);

        if(qnt<=5){
            desc = (total*0.02f);
            vl = (total-desc);
            System.out.println("Produto: "+nome+"\nTotal: R$"+total+"\nDesconto: R$"+desc+"\nValor final: R$"+vl);
        }
        else if((qnt>5)&&(qnt<=10)){
            desc = (total*0.03f);
            vl = (total-desc);
            System.out.println("Produto: "+nome+"\nTotal: R$"+total+"\nDesconto: R$"+desc+"\nValor final: R$"+vl);
        }else{
            desc = (total*0.05f);
            vl = (total-desc);
            System.out.println("Produto: "+nome+"\nTotal: R$"+total+"\nDesconto: R$"+desc+"\nValor final: R$"+vl);
        }
    }
}