package innerAnonimousClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jeka on 23/08/2016.
 */
public class ColorFrame extends JFrame {
    public ColorFrame(Color color) throws HeadlessException {
        setSize(500,500);
        JButton button = new JButton("click to change color");
        MyListener myListener = new MyListener();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(color);
            }
        });
        getContentPane().add(button, BorderLayout.SOUTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
