import java.util.Scanner;

public class l7e09{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String mes;

        System.out.println("Informe um mês:");
        mes = sc.nextLine();

        switch(mes){
            case "Janeiro":
            case "Fevereiro":
            case "Junho":
            case "Julho":
            case "Dezembro":
                System.out.println("O mês informado é de alta temporada");
                break;

            case "Março":
            case "Abril":
            case "Maio":
            case "Agosto":
            case "Setembro":
            case "Novembro":
                System.out.println("O mês informado é de baixa temporada");
                break;

            default:
                System.out.println("Mês inválido!");
        }
    }
}