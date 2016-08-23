package io;

import lombok.SneakyThrows;

import java.io.*;

/**
 * Created by Jeka on 23/08/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("c:\\temp\\a.txt");
        file.delete();
        file.createNewFile();
        try( FileOutputStream fileOutputStream =
                     new FileOutputStream(file);
        ObjectOutputStream oos =
                new ObjectOutputStream(fileOutputStream);) {

            oos.writeObject(args);

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}













