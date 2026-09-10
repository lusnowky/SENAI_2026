package listaDeExercicios;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //
        System.out.println("Informe o seu tempo de contratação nesta empresa: ");
        Scanner sc = new Scanner(System.in);
        int tempoContratacao = sc.nextInt();
        if(tempoContratacao >= 3){
            System.out.println("Adesão ao plano de Saúde Disponível");
        } else {
            System.out.println("Adesão ao plano de Saúde Não Disponível");
        }
    }
}
