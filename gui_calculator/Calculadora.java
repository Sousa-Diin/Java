/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @autho Wildes Sousa
 */
public class Calculadora {
    private JFrame janela;
    
    private JLabel lblNum1;
    private JLabel lblNum2;
    private TextField txtNum1;
    private TextField txtNum2;
    
    private JButton btnPlus;
    private JButton btnSub;
    private JButton btnMult;
    private JButton btnDiv;
    

    public Calculadora() {
        janela = new JFrame();
        janela.setSize(100, 30);
        lblNum1 = new JLabel("Numero1: ");
        lblNum2 = new JLabel("Numero2: ");
        txtNum1 = new TextField(15);
        txtNum2 = new TextField(15);
        
        btnPlus = new JButton("+");
        btnSub = new JButton("-");
        btnMult = new JButton("*");
        btnDiv = new JButton("/");
        
        montarJanela();
        
        btnPlus.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double  n1 = 0, n2 = 0;
                n1 = Double.parseDouble(txtNum1.getText());
                n2 = Double.parseDouble(txtNum2.getText());
                
                JOptionPane.showMessageDialog(janela, "O resultado da soma é: " + (n1 + n2));
            }
        }
        );
        
        btnSub.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double  n1 = 0, n2 = 0;
                n1 = Double.parseDouble(txtNum1.getText());
                n2 = Double.parseDouble(txtNum2.getText());
                
                JOptionPane.showMessageDialog(janela, "O resultado da subtração é: " + (n1 - n2));
            }
        }
        );
        
        btnMult.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double  n1 = 0, n2 = 0;
                n1 = Double.parseDouble(txtNum1.getText());
                n2 = Double.parseDouble(txtNum2.getText());
                
                JOptionPane.showMessageDialog(janela, "O resultado da multiplicação é: " + (n1 * n2));
            }
        }
        );
        
        btnDiv.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double  resul = 0 ,n1 = 0, n2 = 0;
                n1 = Double.parseDouble(txtNum1.getText());
                n2 = Double.parseDouble(txtNum2.getText());
                resul = (n1 / n2);
                
                JOptionPane.showMessageDialog(janela, "O resultado da divisão é: " + resul);
            }
        }
        );
        
    }
            
    private void montarJanela(){
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new GridLayout(2, 4));
        janela.add(lblNum1);
        janela.add(txtNum1);
        janela.add(lblNum2);
        janela.add(txtNum2);
       
        janela.add(btnPlus);
        janela.add(btnSub);
        janela.add(btnMult);
        janela.add(btnDiv);
        
        janela.pack();
    }
    
    
    public void show(){
        janela.setVisible(true);
    }
}
