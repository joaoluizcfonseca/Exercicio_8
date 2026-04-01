import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        int num1, num2, resultado;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero "));
        resultado = num1 + num2;
        JOptionPane.showMessageDialog(null, "O resultado da soma é " + resultado);
        
        
    }
}