package production.test.java2d;

import javax.swing.*;
import java.awt.*;

class BasicShapesEx extends JFrame {

    public BasicShapesEx() {

        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("Basic shapes");
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                BasicShapesEx ex = new BasicShapesEx();
                ex.setVisible(true);
            }
        });
    }
}