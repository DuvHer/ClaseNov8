/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasenov8juego;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class Board extends JPanel implements ActionListener{
    private Timer timer;
    private int x;
    private int y;
    public Board(){
        this.x=-25;
        this.y=-25;
        timer=new Timer(100, this);
        timer.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.x+=2;
        this.y+=1;
        repaint();
        //System.out.println("Me invocaron");
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(this.x,this.y,20,20);
    }
  
}
