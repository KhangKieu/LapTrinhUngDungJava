/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Khang Kieu
 */
public class Bai4 extends JFrame{

     public Bai4(){
        super("BorderLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        Bai4 ui= new Bai4();
        ui.setSize(200, 200);
        ui.setVisible(true);
        ui.setLocationRelativeTo(null);
        
        JPanel pnBorder = new JPanel();
             pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth  = new JPanel();
             pnNorth.setBackground(Color.red);
             pnBorder.add(pnNorth,BorderLayout.NORTH);
             
        JPanel pnSouth  = new JPanel();
             pnNorth.setBackground(Color.red);
             pnBorder.add(pnNorth,BorderLayout.SOUTH);
             
             
        JPanel pnWest  = new JPanel();
             pnNorth.setBackground(Color.blue);
             pnBorder.add(pnNorth,BorderLayout.WEST);
             
        JPanel pnEast  = new JPanel();
             pnNorth.setBackground(Color.blue);
             pnBorder.add(pnNorth,BorderLayout.EAST);
             
        JPanel pnCenter = new JPanel();
            pnCenter.setBackground(Color.GREEN);
            pnCenter.add(pnCenter,BorderLayout.CENTER);
            
            
          
            ui.add(pnBorder);
    }
}
    
