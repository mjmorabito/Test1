package test1;


import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author markmorabito
 */
public class EmptyFrameMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("An Empty Frame!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
    
}
