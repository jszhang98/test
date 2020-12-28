package production.test.observable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("should I do it?");
        button.addActionListener(new AngelListenter());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER,button);
        frame.setVisible(true);
    }

    class AngelListenter implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Don't do it, you might regret it."+event.getActionCommand());


        }
    }

    class DevilListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Come on, do it.");
        }
    }
}
