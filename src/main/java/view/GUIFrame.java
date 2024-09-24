/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author dudue
 */
public class GUIFrame extends JFrame{
    
   private PanelCanvas panelCanvas;
   private PanelColor panelColor;
   private PanelMove panelMove;
    
    public GUIFrame (){
        
        this.panelCanvas= new PanelCanvas();//Para inicializarlo dentro del frame (this)
        this.panelColor= new PanelColor();       
        this.panelMove= new PanelMove();   
        
        
        this.setSize(500, 500); // Tamaño del frame
        this.setTitle("Laboratorio 4"); // Titulo del frame
        this.setVisible(true); // Hacerlo visible
        
        this.add(panelCanvas, BorderLayout.CENTER);
        this.add(panelMove, BorderLayout.SOUTH);
        this.add(panelColor, BorderLayout.NORTH);
        
    } //Fin del public GUIFrame
    
    public GUIFrame (String Titulo, int ancho, int alto ){
        
        this.setSize(ancho, alto);
        this.setTitle(Titulo);
        this.setVisible(true);
        
        
    }
    

    
    public PanelCanvas getPanelCanvas(){ //Esto retorna toda la informacion que esta en panel canvas
        return this.panelCanvas;
    }
    
        public PanelMove getPanelMove(){ //Esto retorna toda la informacion que esta en panel canvas
        return panelMove;
    }
        
            public PanelColor getPanelColor(){ //Esto retorna toda la informacion que esta en panel canvas
        return panelColor;
    }
    
    }//Fin de la clase    

