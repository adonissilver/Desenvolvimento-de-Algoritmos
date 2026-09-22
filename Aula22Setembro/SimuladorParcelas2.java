import javax.swing.JOptionPane;

public class SimuladorParcelas2 {
    public static void main(String[] args) {
        double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Valor total da compra R$:"));
        int qtdeParcelas = Integer.parseInt(JOptionPane.showInputDialog("Nº de parcelas (1, 2 ou 4):"));
        double juros = 0;

        switch (qtdeParcelas) {
            case 1: juros = 0; break;
            case 2: juros = 3; break;
            case 4: juros = 7; break;
            default: juros = -1;
        }

        if (juros == -1) {
    JOptionPane.showMessageDialog(null, "Número incorreto!");
        } else {
    double valorFinal = valorCompra + (valorCompra * juros / 100);
    double valorParcelado = valorFinal / qtdeParcelas;
    JOptionPane.showMessageDialog(null, "Valor de cada parcela: R$ " + String.format("%.2f", valorParcelado));
    }
    }
}