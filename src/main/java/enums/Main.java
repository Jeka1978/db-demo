package enums;

import lombok.SneakyThrows;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by Jeka on 23/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        MaritalStatus maritalStatus = MaritalStatus.findByDbCode(17);
        String russianDesc = maritalStatus.getRussianDesc();
        System.out.println("russianDesc = " + russianDesc);
    }


    @SneakyThrows
    public void addTextFile(File file, String text) {
        if (file.exists()) {

            FileOutputStream fileOutputStream =
                    new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
//            dataOutputStream.writeUTF(text);
        }
    }




















}
