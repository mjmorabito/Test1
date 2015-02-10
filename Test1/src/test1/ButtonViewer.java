package test1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonViewer {
    private static final int FRAME_WIDTH = 1000;
    private static final int FRAME_HEIGHT = 600;
    
   
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        /**JButton button = new JButton("Click me!");
        frame.add(button);
        
        ActionListener listener = new ClickListener();
        button.addActionListener(listener);*/
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JButton button2 = new JButton("Deposit");
        //inner class becase this method is declared in the 
        //same method as the button variable
        panel.add(button2);
        panel.add(label);
        frame.add(panel);
        
        
        
        
        class AddInterestListener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                System.out.println("Depositing");
                label.setText("We can set the text on a label");
                
            }
        }
        
        ActionListener listener2 = new AddInterestListener();
        button2.addActionListener(listener2);
        
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
