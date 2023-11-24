import impl.IcmsTax;
import impl.ImportTax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Context context = new Context();

        System.out.printf("Digite o valor do produto: ");
        double value = sc.nextDouble();
        sc.nextLine();

        Boolean run = true;

        while (run) {
            System.out.println("[1] Calcular Imposto sobre Importação");
            System.out.println("[2] Calcular ICMS");
            System.out.println("[3] Sair\n");
            System.out.printf("Escolha uma opção: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    context.setStrategy(new ImportTax());
                    System.out.printf("O Imposto sobre Importação de um produto no valor de R$%.2f é R$%.2f\n\n\n", value, context.calculate(value));
                    break;

                case 2:
                    context.setStrategy(new IcmsTax());
                    System.out.printf("O ICMS de um produto no valor de R$%.2f é R$%.2f\n\n\n", value, context.calculate(value));
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    System.out.println("\n\nOpção inválida.\n\n");
            }
        }
    }
}