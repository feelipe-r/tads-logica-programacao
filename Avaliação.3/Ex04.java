import java.util.Scanner;
import java.util.ArrayList;

public class Ex04{

    public static class Carro{
        String modelo;
        int potencia;
        float valor;
        int ano;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Carro> ListaCarros = new ArrayList<Carro>();
        int c = 1, year, n;
        float lmtInferior, lmtSuperior;
        char op = ' ';

        while(op!='F'){

            System.out.println("MENU:");
            System.out.println("A-Adicionar carro\nB-Listar todos os carros\nC-Consulta por ano\nD-Consulta por valor\nE-Remover carro\nF-Sair");
            op = sc.next().charAt(0);

            switch(op){
                case 'A':
                    Carro car = new Carro();

                    System.out.println("Informe o modelo do carro:");
                    car.modelo = sc.next();

                    System.out.println("Informe a potencia do carro:");
                    car.potencia = sc.nextInt();

                    System.out.println("Informe o valor do carro:");
                    car.valor = sc.nextFloat();

                    System.out.println("Informe o ano do carro:");
                    car.ano = sc.nextInt();

                    ListaCarros.add(car);
                    break;

                case 'B':
                    System.out.println("\nLista de carros:");
                    for(Carro carro : ListaCarros){
                        System.out.println("=========================================");
                        System.out.println("Carro "+c);
                        System.out.println("Modelo: "+carro.modelo);
                        System.out.println("Potencia: "+carro.potencia+"HP");
                        System.out.println("Valor: R$"+carro.valor);
                        System.out.println("Ano "+carro.ano);
                        System.out.println("=========================================");
                        c++;
                    }
                    c = 1;
                    break;

                case 'C':
                    System.out.println("Informe um ano para consultar os carros:");
                    year = sc.nextInt();

                    System.out.println("\nCarros com o ano informado:");
                    System.out.println("=========================================");
                    for(Carro carro : ListaCarros){
                        if(year==carro.ano){
                            System.out.println("Carro: "+carro.modelo+" - Ano: "+carro.ano);
                            System.out.println("=========================================");
                        } 
                    }
                    break;

                case 'D':
                    System.out.println("Informe o limite inferior de valor:");
                    lmtInferior = sc.nextFloat();

                    System.out.println("Informe o limite superior de valor:");
                    lmtSuperior = sc.nextFloat();

                    System.out.println("\nCarros na faixa dos valores informados:");
                    System.out.println("=========================================");
                    for(Carro carro : ListaCarros){
                        if((carro.valor>lmtInferior)&&(carro.valor<lmtSuperior)){
                            System.out.println("Carro: "+carro.modelo+" - Valor: R$"+carro.valor);
                            System.out.println("=========================================");
                        }
                    }
                    break;

                case 'E':
                    System.out.println("Informe numero do carro que deseja remover:");
                    n = sc.nextInt();

                    ListaCarros.remove(n-1);
                    break;

                case 'F':
                    break;

                default:
                    System.out.println("Opcao invalida!");    
            }
            System.out.println(" ");
        }
    }
}