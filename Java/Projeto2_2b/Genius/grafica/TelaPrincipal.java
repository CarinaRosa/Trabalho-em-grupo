package grafica;

import javax.swing.JFrame;

public class TelaPrincipal extends JFrame {
    
    public TelaPrincipal () {
        super("Jogo Genius");

        this.setBounds(250, 100, 350, 350);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
