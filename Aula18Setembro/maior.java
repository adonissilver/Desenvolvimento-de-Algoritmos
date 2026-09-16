import javax.swing.JOptionPane;

public class Maior {
public static void main(String args[]) {
int idade;
// Entrada gráfica e tratamento numérico
idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
// Condicional Composta com blocos delimitados
if (idade >= 18) {
JOptionPane.showMessageDialog(null, "Maior de idade");
} else {
JOptionPane.showMessageDialog(null, "Menor de idade");
}
}
}

import javax.swing.JOptionPane;

public class Maior{
    public static void main(String args[]){
        idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade "));

        if (idade>=18){
            JOptionPane.showMessageDialog(null, "Maior de idade");
        } else{
            JOptionPane.showMessageDialog(null,"Menor de idade ");
        }
        }
        }
    }
}