package Interface;

import EstruturadeDados.Pilha;
import JavaBeans.Fundo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;



public class Tela extends JFrame implements ActionListener {
    JLabel texto;
    JLabel trocar;
    JButton amarelo;
    JButton azul;
    JButton vermelho;
    JButton verde;
    JButton rosa;
    JButton desfazer;
    JButton limpar;
    JPanel painel;
    ImageIcon icone;
    private Pilha pilha;
    
public Tela(){
    texto = new JLabel ("Escolha uma cor de funto para o cabeçalho da prova:");
    amarelo = new JButton();
    azul = new JButton();
    vermelho = new JButton();
    verde = new JButton();
    rosa = new JButton();
    desfazer = new JButton();
    limpar = new JButton("Limpar Tudo");
    painel = new JPanel();
    trocar = new JLabel ("Troque a cor!");
    Icon icone = new ImageIcon(getClass().getResource("/Imagens/return.png"));
    desfazer.setIcon(icone);
    pilha = new Pilha();
    
    this.setLayout(null);
    this.setBounds (200,200,500,300);
    this.setVisible(true);
    this.setTitle("Exercício de Pilha");
    this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
    amarelo.addActionListener(this);
    azul.addActionListener(this);
    vermelho.addActionListener(this);
    verde.addActionListener(this);
    rosa.addActionListener(this);
    desfazer.addActionListener(this);
    limpar.addActionListener(this);   
    
    this.add(texto);
    this.add(amarelo);
    this.add(azul);
    this.add(vermelho);
    this.add(verde);
    this.add(rosa);
    this.add(desfazer);
    this.add(limpar);
    this.add(painel);
    painel.add(trocar);   
    
    texto.setBounds(90,150,400,50);
    
    amarelo.setBounds(40,200,40,40);
    amarelo.setBackground(Color.YELLOW);
    amarelo.setBorder(new LineBorder(Color.BLACK));
    
    azul.setBounds(85,200,40,40);
    azul.setBackground(Color.BLUE);
    azul.setBorder(new LineBorder(Color.BLACK));
    
    vermelho.setBounds(130,200,40,40);
    vermelho.setBackground(Color.red);
    vermelho.setBorder(new LineBorder(Color.BLACK));
    
    verde.setBounds(175,200,40,40);
    verde.setBackground(Color.GREEN);
    verde.setBorder(new LineBorder(Color.BLACK));
    
    rosa.setBounds(220,200,40,40);
    rosa.setBackground(Color.MAGENTA);
    rosa.setBorder(new LineBorder(Color.BLACK));
    
    desfazer.setBounds(280,195,48,48);
    desfazer.setIcon(icone);
    desfazer.setBorderPainted(false);
    desfazer.setContentAreaFilled(false);
    
    limpar.setBounds(350,200,110,40);
    limpar.setContentAreaFilled(false);
    limpar.setBorder(new LineBorder(Color.BLACK));
    
    painel.setBounds(30,30,425,100);
    painel.setBackground(Color.WHITE);
    painel.setBorder(new LineBorder(Color.BLACK));
    trocar.setBounds(100,100,300,70);
               
}
    public void actionPerformed(ActionEvent e) {
    if (e.getSource().equals(limpar)) {
            while(!pilha.isEmpty()){
                pilha.pop();     
            }
            painel.setBackground(Color.WHITE);
        } 
    else if (e.getSource().equals(desfazer)) {
            Fundo corAnterior = pilha.pop();
            if (!pilha.isEmpty()) {
                painel.setBackground(corAnterior.getCor()); 
            } else {
                painel.setBackground(Color.WHITE); 
            }
        }
    else if (e.getSource().equals(amarelo)){
            painel.setBackground(Color.YELLOW);
            pilha.push(new Fundo(Color.YELLOW));
            
    }
    else if (e.getSource().equals(azul)){
            painel.setBackground(Color.BLUE);
            pilha.push(new Fundo(Color.BLUE));
            
    }
    else if (e.getSource().equals(vermelho)){
            painel.setBackground(Color.red);
            pilha.push(new Fundo(Color.red));
            
    }
    else if (e.getSource().equals(verde)){
            painel.setBackground(Color.GREEN);
            pilha.push(new Fundo(Color.GREEN));
            
    }
    else if (e.getSource().equals(rosa)){
            painel.setBackground(Color.MAGENTA);
            pilha.push(new Fundo(Color.MAGENTA));
            
    }
    }
}
