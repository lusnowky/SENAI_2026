// 3.1 Média aritmética / Ponderada
import java.util.Scanner;

class Main3_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        int n1 = entrada.nextInt();
        System.out.print("Segunda nota: ");
        int n2 = entrada.nextInt();
        System.out.print("Terceira nota: ");
        int n3 = entrada.nextInt();

        double media = (n1 * 0.30) + (n2 * 0.30) + (n3 * 0.40);
        System.out.println("Média final: " + media);

        entrada.close();
    }
}