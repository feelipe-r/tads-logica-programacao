import java.util.Scanner;

public class l4e24{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String nome = " " , flag = "@", nm_alt = " ", nm_peso = " ";
        char sexo;
        int idade, a=1;
        float peso, altura, soma_id=0, media_id, maior_alt=0, maior_peso=0;
        
        while(!nome.equals(flag)){
            System.out.println("Informe o nome do(a) atleta "+a+":");
            nome = sc.next();

            if(nome.equals(flag)){
                break;
            }
            System.out.println("Informe o sexo do(a) atleta "+a+":\n[M]-Masculino\n[F]-Feminino");
            sexo = sc.next().charAt(0);

            System.out.println("Informe a idade do(a) atleta "+a+":");
            idade = sc.nextInt();

            System.out.println("Informe o peso do(a) atleta "+a+":");
            peso = sc.nextFloat();

            System.out.println("Informe a altura do(a) atleta "+a+":");
            altura = sc.nextFloat();

            soma_id = (soma_id+idade);

            if(sexo=='M'){
                if(altura>maior_alt){
                    maior_alt = altura;
                    nm_alt = nome;
                }
            }
            if(sexo=='F'){
                if(peso>maior_peso){
                    maior_peso = peso;
                    nm_peso = nome;
                }
            }
            a++;
        }
        a = (a-1);
        media_id = (soma_id/a);
        System.out.println("Atleta do sexo masculino mais alto:\nAtleta: "+nm_alt+"\nAltura: "+maior_alt);
        System.out.println("Atleta do sexo feminino mais pesada:\nAtleta: "+nm_peso+"\nPeso: "+maior_peso);
        System.out.printf("Média de idade dos atletas: %.2f%n",media_id);
    }
}