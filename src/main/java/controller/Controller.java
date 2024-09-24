/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.GUIFrame;
import view.PanelCanvas;

/**
 *
 * @author dudue
 */
public class Controller implements ActionListener {
    
    private GUIFrame guiFrame;
    private PanelCanvas panelCanvas;
    
    public Controller (){
        //Jframe relacion
        this.guiFrame= new GUIFrame();
        //Por medio del JFrame me relaciono con el getPanelCanvas=PanelCanvas
        this.panelCanvas=guiFrame.getPanelCanvas();
        this.guiFrame.getPanelColor().listenerButton(this);
        this.guiFrame.getPanelMove().listenerButton(this);
        
    }
//Action event define la accion de la clase abstracta
    public void actionPerformed(ActionEvent e) {
     //m   
     if(e.getSource() == guiFrame.getPanelMove().getBtnUp()){
         panelCanvas.moveUp();
     }else if(e.getSource() == guiFrame.getPanelMove().getBtnDown()){
         panelCanvas.moveDown();
     }else if(e.getSource() == guiFrame.getPanelMove().getBtnLeft()){
        panelCanvas.moveLeft();
     }else if(e.getSource() == guiFrame.getPanelMove().getBtnRight()){
            panelCanvas.moveRight();
        }
    if(e.getSource() == guiFrame.getPanelColor().getBtnRed()){
         panelCanvas.setColor(Color.RED);
     }else if(e.getSource() == guiFrame.getPanelColor().getBtnBlue()){
        panelCanvas.setColor(Color.BLUE);
     }else if(e.getSource() == guiFrame.getPanelColor().getBtnGreen()){
        panelCanvas.setColor(Color.GREEN);
        }
    }
}

