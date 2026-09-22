import javax.swing.JOptionPane;

public class CalculoIRRF {

    public static void main(String[] args) {

        // Entrada do salário bruto
        double salario = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o salário bruto:")
        );

        double aliquota;

        // Verificação da faixa do IRRF
        if (salario <= 2259.20) {

            aliquota = 0;

        } else if (salario <= 2826.65) {

            aliquota = 7.5;

        } else if (salario <= 3751.05) {

            aliquota = 15.0;

        } else if (salario <= 4664.68) {

            aliquota = 22.5;

        } else {

            aliquota = 27.5;
        }

        // Exibição do resultado
        JOptionPane.showMessageDialog(
            null,
            "Salário bruto: R$ " + String.format("%.2f", salario) +
            "\nAlíquota do IRRF: " + aliquota + "%"
        );
    }
}