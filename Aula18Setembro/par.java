import javax.swing.JOptionPane;
public class Par {
public static void main(String[] args) {
int num;
// Entrada de dados gráfica com tratamento numérico (parsing)
num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro"));
// Condicional Simples para validação do resto
if (num % 2 == 0) {
JOptionPane.showMessageDialog(null, "O número: " + num + " é par");
}
}
}