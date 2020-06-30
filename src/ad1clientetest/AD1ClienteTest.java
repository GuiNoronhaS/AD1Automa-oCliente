package ad1clientetest;
import javax.swing.JOptionPane;
import ws.unisul.calculator.*;

/**
 *
 * @author Guilherme Noronha
 */
public class AD1ClienteTest {

    public static void main(String[] args) {
        try {
        WSCalculadora_Service servico = new WSCalculadora_Service();
        WSCalculadora porta = servico.getWSCalculadoraPort();
        
        double a = 100;
        double b = 10;
        //a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a variavel 1 da soma"));
        //b = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a variavel 2 da soma"));
        
        double resposta1 = porta.somar(a, b);
        
        System.out.println("A soma de " + a + " e " + b + " é igual a: " + resposta1);
        JOptionPane.showMessageDialog(null, "A soma de " + a + " e " + b + " é igual a: " + resposta1);
        
        //a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a variavel 1 da subtração"));
        //b = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a variavel 2 da subtração"));
        
        double resposta2 = porta.subtracao(a, b);
        
        System.out.println("A subtracao de " + a + " e " + b + " é igual a: " + resposta2);
        JOptionPane.showMessageDialog(null, "A subtracao de " + a + " e " + b + " é igual a: " + resposta2);
        
        
        //a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a variavel 1 da multiplicação"));
        //b = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a variavel 2 da multiplicação"));
       
        double resposta3 = porta.multiplcacao(a, b);
        
        System.out.println("A multiplcacao de " + a + " e " + b + " é igual a: " + resposta3);
        JOptionPane.showMessageDialog(null, "A multiplcacao de " + a + " e " + b + " é igual a: " + resposta3);
        
        
        //a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a variavel 1 da divisão"));
        //b = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a variavel 2 da divisão"));
       
        double resposta4 = porta.divisao(a, b);
        
        System.out.println("A divisao de " + a  + " e " + b + " é igual a: " + resposta4);
        JOptionPane.showMessageDialog(null, "A divisao de " + a  + " e " + b + " é igual a: " + resposta4);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
    
}
