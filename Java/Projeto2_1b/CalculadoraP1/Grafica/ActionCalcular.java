package Projeto2_1b.CalculadoraP1
.Grafica;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Projeto2_1b.CalculadoraP1.Logica.Calculadora;

public class ActionCalcular extends AbstractAction {

    
    private JTextField txtX, txtY;
    private JComboBox<String> cbxOperacao;

    public ActionCalcular(JTextField txtX, JTextField txtY, JComboBox<String> cbxOperacao){
        this.txtX = txtX;
        this.txtY = txtY;
        this.cbxOperacao = cbxOperacao;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            double x = Double.parseDouble(txtX.getText());
            double y = Double.parseDouble(txtY.getText());
            Calculadora calc = new Calculadora(x, y);

            if (cbxOperacao.getSelectedItem().equals("Soma")) {
                JOptionPane.showMessageDialog(null, String.format("O resultado de %f + %f é %f", x, y, calc.somar()), "Calculadora Simpes", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (cbxOperacao.getSelectedItem().equals("Subtração")) {
                JOptionPane.showMessageDialog(null, String.format("O resultado de %f - %f é %f", x, y, calc.subtrair()), "Calculadora Simpes", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (cbxOperacao.getSelectedItem().equals("Multiplicação")) {
                JOptionPane.showMessageDialog(null, String.format("O resultado de %f * %f é %f", x, y, calc.multiplicar()), "Calculadora Simpes", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (cbxOperacao.getSelectedItem().equals("Divisão")) {
                JOptionPane.showMessageDialog(null, String.format("O resultado de %f / %f é %f", x, y, calc.dividir()), "Calculadora Simpes", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, ("Digite um numero valido!!"), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
