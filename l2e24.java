import java.util.Scanner;

public class l2e24{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int soma, prod;

        System.out.println("Informe a idade do primeiro homem:");
        int id_h1 = sc.nextInt();

        System.out.println("Informe a idade do segundo homem:");
        int id_h2 = sc.nextInt();

        System.out.println("Informe a idade da primeira mulher:");
        int id_m1 = sc.nextInt();

        System.out.println("Informe a idade da segunda mulher:");
        int id_m2 = sc.nextInt();

        if((id_h1>id_h2)&&(id_m1>id_m2)){
            soma = (id_h1+id_m2);
            prod = (id_h2*id_m1);
            System.out.println("Soma da idade do homem mais velho com a idade da mulher mais nova: "+soma);
            System.out.println("Produto da idade do homem mais novo com a idade da mulher mais velha: "+prod);
        }
        else if((id_h1<id_h2)&&(id_m1>id_m2)){
            soma = (id_h2+id_m2);
            prod = (id_h1*id_m1);
            System.out.println("Soma da idade do homem mais velho com a idade da mulher mais nova: "+soma);
            System.out.println("Produto da idade do homem mais novo com a idade da mulher mais velha: "+prod);
        }
        else if((id_h1>id_h2)&&(id_m1<id_m2)){
            soma = (id_h1+id_m1);
            prod = (id_h2*id_m2);
            System.out.println("Soma da idade do homem mais velho com a idade da mulher mais nova: "+soma);
            System.out.println("Produto da idade do homem mais novo com a idade da mulher mais velha: "+prod);
        }
        else if((id_h1<id_h2)&&(id_m1<id_m2)){
            soma = (id_h1+id_m1);
            prod = (id_h2*id_m2);
            System.out.println("Soma da idade do homem mais velho com a idade da mulher mais nova: "+soma);
            System.out.println("Produto da idade do homem mais novo com a idade da mulher mais velha: "+prod);
        }
    }
}