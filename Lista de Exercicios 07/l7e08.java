import java.util.Scanner;

public class l7e08{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int mult=0, soma=0, aux=10, rest;
        int mult2=0, soma2=0, aux2=11, rest2;
        int a=0, b=0;
        int cpf[] = new int[11];

        for(int i=0; i<cpf.length; i++){
            System.out.println("Informe o digito "+(i+1)+" do CPF:");
            cpf[i] = sc.nextInt();

            if(i<9){
                mult = (cpf[i]*aux);
                soma = (soma+mult);
                aux--;
            }
            if(i<10){
                mult2 = (cpf[i]*aux2);
                soma2 = (soma2+mult2);
                aux2--;
            }
        }
        rest = (11-(soma%11));
        rest2 = (11-(soma2%11));

        if((rest<10)&&(cpf[9]==rest)){
            a++;
        }else{
            if(cpf[9]==0){
                b++;
            }
        }
        if((a==0)&&(b==0)){
            System.out.println("CPF inválido!");
        }else{
            a=b=0;
            if((rest2<10)&&(cpf[10]==rest2)){
                a++;
            }else{
                if(cpf[10]==0){
                    b++;
                }
            }
            if((a==0)&&(b==0)){
                System.out.println("CPF inválido!");
            }else{
                System.out.println("CPF válido!");
            }
        }      
    }
}
