import java.util.Scanner;
import java.util.ArrayList;

public class Ex03{

    public static class Aluno{
        String nome;
        int idade;
        float altura;
        float peso;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Aluno> ListaAlunos = new ArrayList<Aluno>();
        ArrayList imcDown = new ArrayList();
        ArrayList imcUp = new ArrayList();
        float imc;
        int maiorId = 0;
        char op = ' ';
        String old = " ";
        
        while(op!='E'){
        
            System.out.println("MENU:\nA-Adicionar aluno\nB-Ver lista atual de alunos\nC-Listar alunos com IMC abaixo de 18.5 e acima de 25\nD-Aluno mais velho\nE-Sair");
            op = sc.next().charAt(0);

            switch(op){
                case 'A':
                    Aluno aln = new Aluno();

                    System.out.println("Informe o nome do aluno:");
                    aln.nome = sc.next();
            
                    System.out.println("Informe a idade do aluno:");
                    aln.idade = sc.nextInt();
            
                    System.out.println("Informe a altura do aluno:");
                    aln.altura = sc.nextFloat();
            
                    System.out.println("Informe o peso do aluno:");
                    aln.peso = sc.nextFloat();
            
                    ListaAlunos.add(aln);
                    break;

                case 'B':
                    System.out.println("\nLista de alunos:");
                    for(Aluno aluno : ListaAlunos){
                        System.out.println("==============================");
                        System.out.println("Nome: "+aluno.nome);
                        System.out.println("Idade: "+aluno.idade);
                        System.out.println("Altura: "+aluno.altura);
                        System.out.println("Peso: "+aluno.peso);
                        System.out.println("==============================");
                    }
                    break;

                case 'C':
                    for(Aluno aluno : ListaAlunos){
                        imc = (aluno.peso/(aluno.altura*2));

                        if(imc<18.5f){
                            imcDown.add(aluno.nome);
                            imcDown.add(imc);
                        }
                        else if(imc>25){
                            imcUp.add(aluno.nome);
                            imcUp.add(imc);
                        }
                    }
                    System.out.println("\nAlunos com IMC abaixo de 18.5:");
                    for(int i=0; i<imcDown.size(); i++){
                        if(i%2!=0){
                            System.out.println("==============================");
                            System.out.println("IMC: "+imcDown.get(i));
                        }else{
                            System.out.println("==============================");
                            System.out.println("Nome: "+imcDown.get(i));
                        }
                    }
                    System.out.println("==============================");
                    System.out.println("\nAlunos com IMC acima de 25:");
                    for(int i=0; i<imcUp.size(); i++){
                        if(i%2!=0){
                            System.out.println("==============================");
                            System.out.println("IMC: "+imcUp.get(i));
                        }else{
                            System.out.println("==============================");
                            System.out.println("Nome: "+imcUp.get(i)); 
                        }
                    }
                    System.out.println("==============================");
                    break;

                case 'D':
                    for(Aluno aluno : ListaAlunos){
                        if(aluno.idade>maiorId){
                            maiorId = aluno.idade;
                            old = aluno.nome;
                        }
                    }
                    System.out.println("==============================");
                    System.out.println("Aluno mais velho: "+old+"\nIdade: "+maiorId);
                    System.out.println("==============================");
                    break;

                case 'E':
                    break;
                
                default:
                    System.out.println("Opcao invalida!");
            }
            System.out.println(" ");
        }
    }
}