package Teste1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FrmJogo extends JFrame{
    
    private JToolBar Barra_Ferramenta = new JToolBar();
    private JButton Button_Novo_Jogo = new JButton("Novo Jogo");
    
    private JPanel Panel = new JPanel();
    private GridLayout Layout_do_Jogo = new GridLayout(4,4);
    private JButton Escolha[] = new JButton[16];

    private JPanel Barra_de_Status = new JPanel();
    private JLabel Pontuacao_do_Jogador = new JLabel("Pontos: 100");

    int pontos = 100;  
 
    Random RandomNumber = new Random();
    int Aleatorio[] = new int [16];
    int Posicao_do_vetor_Aleatorio[] = new int [16];

    public FrmJogo() {
        super("Jogo da Memória");

        Barra_Ferramenta.add(Button_Novo_Jogo);

        for (int i=0; i<16; ++i){
            Escolha[i] = new JButton();
            Panel.add(Escolha[i]);
            Escolha[i].setVisible(true);
        }

        Panel.setLayout(Layout_do_Jogo);
        add(Panel, BorderLayout.CENTER);
     
        Barra_de_Status.add(Pontuacao_do_Jogador);
        add(Barra_de_Status, BorderLayout.SOUTH);

        ActionJogo action = new ActionJogo();
        for (int i=0; i<16; ++i){
            Escolha[i].addActionListener(action);
        }
        Escolha.addActionListener(action);
             
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);    
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
