import java.util.Scanner;

public class DesafioInt {

    public static void main(String[] args) {
//DesafioIntegrador
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("===== SISTEMA DE CONSULTA DE BENEFÍCIOS =====");

        System.out.print("Nome do colaborador: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Salário: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Tempo de empresa (em anos): ");
        int tempoEmpresa = scanner.nextInt();

        System.out.print("Quantidade de filhos: ");
        int filhos = scanner.nextInt();

        scanner.nextLine(); // limpa o ENTER

        System.out.print("Modalidade de trabalho (presencial ou home office): ");
        String modalidade = scanner.nextLine();

        System.out.print("Utiliza veículo próprio? (sim ou nao): ");
        String veiculo = scanner.nextLine();

        // Saída
        System.out.println("\n==============================================");
        System.out.println("       RESULTADO DA CONSULTA");
        System.out.println("==============================================");
        System.out.println("Colaborador: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Tempo de empresa: " + tempoEmpresa + " anos");
        System.out.println("Filhos: " + filhos);
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Veículo próprio: " + veiculo);

        System.out.println("\n===== BENEFÍCIOS =====");

        // Vale-alimentação
        if (salario <= 5000) {
            System.out.println("✓ Tem direito ao vale-alimentação.");
        } else {
            System.out.println("✗ Não tem direito ao vale-alimentação.");
        }

        // Auxílio-creche
        if (filhos > 0) {
            System.out.println("✓ Tem direito ao auxílio-creche.");
        } else {
            System.out.println("✗ Não tem direito ao auxílio-creche.");
        }

        // Plano de saúde
        if (idade >= 18 && tempoEmpresa >= 1) {
            System.out.println("✓ É elegível para o plano de saúde.");
        } else {
            System.out.println("✗ Não é elegível para o plano de saúde.");
        }

        // Auxílio home office
        if (modalidade.equalsIgnoreCase("home office")) {
            System.out.println("✓ Tem direito ao auxílio home office.");
        } else {
            System.out.println("✗ Não tem direito ao auxílio home office.");
        }

        // Auxílio combustível
        if (veiculo.equalsIgnoreCase("sim")
                && modalidade.equalsIgnoreCase("presencial")) {
            System.out.println("✓ Tem direito ao auxílio combustível.");
        } else {
            System.out.println("✗ Não tem direito ao auxílio combustível.");
        }

        // PLR
        if (tempoEmpresa >= 1) {
            System.out.println("✓ Participa da PLR.");
        } else {
            System.out.println("✗ Não participa da PLR.");
        }

        // Bolsa de estudos
        if (salario <= 3000 && tempoEmpresa >= 1) {
            System.out.println("✓ É elegível para bolsa de estudos.");
        } else {
            System.out.println("✗ Não é elegível para bolsa de estudos.");
        }

        System.out.println("==============================================");

        scanner.close();
    }
}