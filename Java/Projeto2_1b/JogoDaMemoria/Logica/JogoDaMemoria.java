package Projeto2_1b.JogoDaMemoria.Logica;

import java.util.Random;

import javax.swing.JFrame;

import Projeto2_1b.JogoDaMemoria.Grafica.ActionJogo;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JogoDaMemoria extends JFrame{
    
    int pontos = 100;  
 
    Random RandomNumber = new Random();
    int Aleatorio[] = new int [16];
    int Posicao_do_vetor_Aleatorio[] = new int [16];
 
    // Barra de Ferramenta
    private JToolBar Barra_Ferramenta = new JToolBar();
    private JButton Button_Novo_Jogo = new JButton("Novo Jogo");
    private JButton Button_Re_Iniciar_Jogo = new JButton("Reiniciar partida");
    private JButton Button_Estatisticas = new JButton("Estatísticas");
    private JButton Sobre_JogoDaMemoria = new JButton("Sobre");
 
    private JPanel Panel = new JPanel();
    private GridLayout Layout_do_Jogo = new GridLayout(4,4);
    private Font Fonte = new Font("Lucida Console", Font.BOLD, 36);
    private JButton Escolha[] = new JButton[16];
 
    private JPanel Barra_de_Status = new JPanel();
    private JLabel Pontuacao_do_Jogador = new JLabel("Pontos: 100");
 
    public JogoDaMemoria() {
        super("Jogo da Memória");
     
        Barra_Ferramenta.add(Button_Novo_Jogo);
        Barra_Ferramenta.add(Button_Re_Iniciar_Jogo);
        Barra_Ferramenta.add(Button_Estatisticas);
        Barra_Ferramenta.add(Sobre_JogoDaMemoria);
        add(Barra_Ferramenta, BorderLayout.NORTH);
     
        for (int i=0; i<16; ++i){
            Escolha[i] = new JButton();
            Panel.add(Escolha[i]);
            Escolha[i].setFont(Fonte);
            Escolha[i].setVisible(true);
        }
     
        Panel.setLayout(Layout_do_Jogo);
        add(Panel, BorderLayout.CENTER);
     
        Barra_de_Status.add(Pontuacao_do_Jogador);
        add(Barra_de_Status, BorderLayout.SOUTH);
     
     
        ActionJogo Handler = new ActionJogo();
        for (int i=0; i<16; ++i){
            Escolha[i].addActionListener((ActionListener) Handler);
        }
        Button_Novo_Jogo.addActionListener((ActionListener) Handler);
             
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);    
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
