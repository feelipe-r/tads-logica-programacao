import java.util.Scanner;

public class l6e01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int mat=1, id, fnc=1, a=0, b=0, c=0, d=0, e=0, maior_id=0;
        float alt, soma_alt=0, media_alt;
        char sx, cs;

        while(mat!=0){
            System.out.println("Informe a matricula do funcionário "+fnc+":");
            mat = sc.nextInt();

            if(mat==0){
                break;
            }
            System.out.println("Informe a idade:");
            id = sc.nextInt();

            System.out.println("Informe a altura:");
            alt = sc.nextFloat();

            System.out.println("Informe o sexo\n[M]-Masculino\n[F]-Feminino");
            sx = sc.next().charAt(0);

            System.out.println("Concursado?\n[S]-Sim\n[N]-Não");
            cs = sc.next().charAt(0); 

            if(sx=='F'){
                if(cs=='S'){
                    a++;
                }else if((cs=='N')&&(id>30)){
                    b++;
                }    
            }
            if(sx=='M'){
                c++;
                if(cs=='S'){
                    if(id>maior_id){
                        maior_id = id;
                    }
                }
                if(id<40){
                    soma_alt = (soma_alt+alt);
                    d++;
                }
            }
            if(cs=='S'){
                e++;
            }
            fnc++;
        }
        media_alt = (soma_alt/d);
        System.out.println("Número de funcionárias concursadas: "+a);
        System.out.println("Número de funcionários homens "+c);
        System.out.println("Maior idade entre os homens concursados: "+maior_id);
        System.out.println("Quantidade de mulheres com mais de 30 anos sem concurso: "+b);
        System.out.println("Quantidade de funcionários concursados: "+e);
        System.out.println("Média de altura entre os homens com menos de 40 anos: "+media_alt);
    }
}