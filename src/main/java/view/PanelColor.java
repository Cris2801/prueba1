/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 *
 * @author gamec
 */
public class PanelColor extends JPanel {
    
    private JButton btnBlue;
    private JButton btnRed;
    private JButton btnGreen;
    
    public PanelColor (){
        this.setLayout(new GridLayout(1,3));
        
        btnBlue = new JButton ("Blue");
        btnRed = new JButton ("Red");
        btnGreen = new JButton ("Green");
        
        this.add(btnBlue);
        this.add(btnRed);
        this.add(btnGreen);
    }
    
    public void listenerButton (ActionListener controller){
        
        btnBlue.addActionListener(controller);
        btnRed.addActionListener(controller);
        btnGreen.addActionListener(controller);
    }

    public JButton getBtnBlue(){
        return btnBlue;
    }
    
    public JButton getBtnRed(){
        return btnRed;
    }
    
    public JButton getBtnGreen(){
        return btnGreen;
    }
}

