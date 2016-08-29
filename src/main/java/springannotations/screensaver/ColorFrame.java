package springannotations.screensaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.function.Supplier;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Component
public class ColorFrame extends JFrame{
    @Autowired
    private Supplier<Color> colorSupplier;

    @Autowired
    private Supplier<MyService> myServiceSupplier;

    @PostConstruct
    private void init() {
        setSize(150,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void move() {
        Random random = new Random();
        myServiceSupplier.get().a();
        myServiceSupplier.get().b();
        setLocation(random.nextInt(800),random.nextInt(600));
        getContentPane().setBackground(colorSupplier.get());
        repaint();
    }

}












