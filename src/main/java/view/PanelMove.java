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
public class PanelMove extends JPanel {
    
    private JButton btnUp;
    private JButton btnDown;
    private JButton btnLeft;
    private JButton btnRight;
    
    public PanelMove (){
        this.setLayout(new GridLayout(2,2));
        
        btnUp = new JButton ("Up");
        btnDown = new JButton ("Down");
        btnLeft = new JButton ("Left");
        btnRight = new JButton ("Right");
        
        this.add(btnUp);
        this.add(btnDown);
         this.add(btnLeft);
        this.add(btnRight);
    }
    
    public void listenerButton (ActionListener controller){
        
        btnUp.addActionListener(controller);
        btnDown.addActionListener(controller);
        btnLeft.addActionListener(controller);
        btnRight.addActionListener(controller);
    }

    public JButton getBtnUp(){
        return btnUp;
    }
    
       public JButton getBtnDown(){
        return btnDown;
    }
    
    public JButton getBtnLeft(){
        return btnLeft;
    }
    
    public JButton getBtnRight(){
        return btnRight;
    }
}


