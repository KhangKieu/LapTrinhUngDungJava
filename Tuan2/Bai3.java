/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Khang Kieu
 */
public class Bai3 extends JFrame{
    public Bai3(){
       super("BoxLayout"); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
}
    public static void main(String[] args) {
        Bai3 ui = new Bai3();
        ui.setSize(400, 300);
        ui.setVisible(true);
        ui.setLocationRelativeTo(null);
        
        
        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
        JButton btn1 = new JButton("BoxLayout");
        btn1.setForeground(Color.red);
        Font font  = new Font("Arial", Font.BOLD / Font.ITALIC,25);
        btn1.setFont(font);pnBox.add(btn1);
        
        JButton btn2 = new JButton("X_AXIS");
        btn2.setForeground(Color.yellow);
        btn2.setFont(font);pnBox.add(btn2);
        
         JButton btn3 = new JButton("Y_AXIS");
        btn3.setForeground(Color.BLUE);
        btn3.setFont(font);pnBox.add(btn3);
        
        
        ui.add(pnBox);
        
        
        }
    }
    