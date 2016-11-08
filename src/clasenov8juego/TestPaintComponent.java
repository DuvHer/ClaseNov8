/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasenov8juego;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author Estudiante
 */
public class TestPaintComponent extends JFrame {
    public TestPaintComponent(){
        add (new NewPanel());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestPaintComponent frame= new TestPaintComponent();
        frame.setTitle("Test Paint Component");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}

class NewPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.drawLine(0,0,50,50);
        //g.drawString("Banner",0,40);
        //g.drawRect(50, 50, 50, 50);
        g.setColor(Color.blue);
        //g.fillRect(50, 50, 50, 50);
        g.drawOval(50, 50, 50, 50);
        g.fillRect(70, 100, 10, 10);
        g.fillRect(50, 125, 10, 10);
        g.fillRect(90, 125, 10, 10);
        g.fillRect(30, 100, 10, 10);
        g.fillRect(60, 150, 10, 10);
        g.fillRect(70, 200, 10, 10);
        g.fillRect(50, 250, 10, 10);
        g.fillRect(90, 250, 10, 10);
        g.fillRect(50, 300, 10, 10);
        g.fillRect(90, 300, 10, 10);
        
        
        g.drawLine(75,105,55,130);
        g.drawLine(55,130,35,105);
        g.drawLine(75,105,95,130);
        g.drawLine(95,130,65,155);
        g.drawLine(75,105,75,205);
        g.drawLine(75,205,95,255);
        g.drawLine(75,205,55,255);
        g.drawLine(55,255,55,305);
        g.drawLine(95,255,95,305);
        //g.drawRect(90, 100, 10, 10);
        //g.drawRect(70, 100, 10, 10);*/
    }

}
