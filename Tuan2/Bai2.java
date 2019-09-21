/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Khang Kieu
 */
public class Bai2 extends JFrame{
    public Bai2(){
        super("Demo JPanel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    public static void main(String[] args) {
        Bai2 jpn = new Bai2();
        jpn.setSize(400, 300);
        jpn.setLocationRelativeTo(null);
        jpn.setVisible(true);
        
        JPanel pnFlow = new JPanel();
        pnFlow.setBackground(Color.red);
        JButton btn1 = new JButton("FlowLayout");
        JButton btn2 = new JButton("Add cac control");
        JButton btn3 = new JButton("Tren mot dong");
        JButton btn4 = new JButton("Het cho chua");
        JButton btn5 = new JButton("Thi xuong dong");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        
        jpn.add(pnFlow);
        
   }
}
