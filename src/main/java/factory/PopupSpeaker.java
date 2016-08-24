package factory;

import javax.swing.*;

/**
 * Created by Jeka on 24/08/2016.
 */
public class PopupSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        JOptionPane.showMessageDialog(null,message);
    }
}
