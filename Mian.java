/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeScreen;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author win.7
 */
public class Mian {
    
    
    public static void main(String[] args) {
       
            Login_Form gui = new Login_Form();
            //JFrame frame = new JFrame();
            gui.setSize(new Dimension(1000 , 400 ));
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //frame.getContentPane().add(gui);
            gui.setVisible(true);
            //frame.pack();
            
    
    }
}
