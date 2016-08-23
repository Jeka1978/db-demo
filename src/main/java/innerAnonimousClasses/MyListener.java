package innerAnonimousClasses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.WeakReference;

/**
 * Created by Jeka on 23/08/2016.
 */
public class MyListener implements ActionListener {




    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I'm clicked");
    }
}
