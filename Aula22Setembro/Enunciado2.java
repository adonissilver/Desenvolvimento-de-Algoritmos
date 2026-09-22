import javax.swing.JOptionPane;

public class Enunciado2 {

    public static void main(String[] args) {

        // Entrada do preço atual
        double preco = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o preço atual do produto:")
        );

        double novoPreco;
        int faixa;

        // Descobre a faixa do preço
        if (preco <= 50) {
            faixa = 1;
        } else if (preco <= 100) {
            faixa = 2;
        } else {
            faixa = 3;
        }

        // Calcula o acréscimo
        switch (faixa) {

            case 1:
                novoPreco = preco * 1.05;
                break;

            case 2:
                novoPreco = preco * 1.10;
                break;

            case 3:
                novoPreco = preco * 1.15;
                break;

            default:
                novoPreco = preco;
        }

        // Classificação do NOVO preço
        String classificacao;

        if (novoPreco <= 80) {
            classificacao = "Barato";
        } else if (novoPreco <= 120) {
            classificacao = "Normal";
        } else {
            classificacao = "Caro";
        }

        // Resultado
        JOptionPane.showMessageDialog(
            null,
            "Preço atual: R$ " + String.format("%.2f", preco) +
            "\nNovo preço: R$ " + String.format("%.2f", novoPreco) +
            "\nClassificação: " + classificacao
        );
    }
}