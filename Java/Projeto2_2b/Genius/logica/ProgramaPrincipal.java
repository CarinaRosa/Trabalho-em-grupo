package logica;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ProgramaPrincipal {
    public static void main(String[] args) {

       JFrame geniusFrame = new JFrame();

       JOptionPane.showMessageDialog(null, "Jogo Genius", "Clique abaixo para começar", JOptionPane.PLAIN_MESSAGE);
       geniusFrame.setTitle("Genius");
       geniusFrame.setSize(400, 450);
       geniusFrame.setLocationRelativeTo(null);
       geniusFrame.setIgnoreRepaint(true);
       geniusFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       geniusFrame.setVisible(true);
       geniusFrame.createBufferStrategy(2);
       executarLoopDoJogo(geniusFrame);
    }

    private static void executarLoopDoJogo(JFrame geniusFrame){
        Genius genius = new Genius();

        registraListeners{geniusFrame, genius};

        long ultimosSegundos = System.currentTimeMillis()
    }
    
}
