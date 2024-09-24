/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author dudue
 */
public class PanelCanvas extends JPanel {
    
    private int x;
    private int y;
            private Color currentColor;
    
   public PanelCanvas(){
    
       this.x=20;
       this.y=20;
       this.currentColor = Color.RED;
}        
   public void setColor (Color color){
       this.currentColor = color;
   } 
   
    protected void paintComponent(Graphics g){ // PaintComponent es el que genera o crea un grafico,objeto o figura en el panel
        
        super.paintComponent(g);
        g.setColor(Color.BLACK); //Pone el color a la figura creada
        repaint();
        //currentColor
        g.drawString("Texto movible", x, y);
        //g.fillOval(this.x, this.y, 20, 20)
        //Color a la figura cuadrada
       //g.setColor(Color.DARK_GRAY);
        //g.fillRect(this.x, this.y, 10, 10);
    }
    
public void moveUp(){
    int moveDistance =20;
    if (y - moveDistance >= 0);{
            y -= moveDistance;
}
    repaint ();
}
    
public void moveDown(){
    int moveDistance =20;
    if (y + moveDistance + 20 <= getHeight()){
        y += moveDistance;
    }
    repaint();
}

public void moveRight(){
    int moveDistance =20;
    if (x + moveDistance + 20 <= getWidth ()){
        x += moveDistance;
}
repaint();
}
public void moveLeft(){
    int moveDistance =20;
    
    if(x - moveDistance >= 0) {
        x-= moveDistance;
    }
    repaint();
    }

}