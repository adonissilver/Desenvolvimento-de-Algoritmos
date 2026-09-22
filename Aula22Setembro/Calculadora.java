import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {

        // Entrada do valor
        double numero1 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o valor da compra: ")
        );

        // Menu
        String menu = """
                Escolha uma operação:

                1 - À Vista com 10% de desconto
                2 - Cartão de Crédito com 4% de desconto
                3 - Em 2 vezes sem juros
                """;

        int opcao = Integer.parseInt(
            JOptionPane.showInputDialog(menu)
        );

        double resultado;

        // Escolha da operação
        switch (opcao) {

            case 1:
                resultado = numero1 * 0.90;

                JOptionPane.showMessageDialog(
                    null,
                    "Valor à vista: R$ " + resultado
                );
                break;

            case 2:
                resultado = numero1 * 0.95;

                JOptionPane.showMessageDialog(
                    null,
                    "Valor no cartão: R$ " + resultado
                );
                break;

            case 3:
                resultado = numero1 / 2;

                JOptionPane.showMessageDialog(
                    null,
                    "Parcelado sem juros em 2 vezes de R$ " + resultado
                );
                break;

            default:
                JOptionPane.showMessageDialog(
                    null,
                    "Opção inválida!"
                );
        }
    }
}