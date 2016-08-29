package springannotations.screensaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Component
public class ColorFrame extends JFrame{
    @Autowired
    private Color color;

    @PostConstruct
    private void init() {
        setSize(150,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void move() {
        Random random = new Random();
        setLocation(random.nextInt(800),random.nextInt(600));
        getContentPane().setBackground(color);
        repaint();
    }

}












