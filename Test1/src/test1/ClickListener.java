package test1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("I was clicked");

    }
}
