package demo1;

import org.fluttercode.datafactory.impl.DataFactory;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Jeka on 22/08/2016.
 */
public class Main {
    public static void main(String[] args) {



        DataFactory dataFactory = new DataFactory();
        String str = "asdasdsa";
        for (int i = 0; i < 10; i++) {
            str = str + new Character('s');
        }

    }


    public void doX(Object o) {
        Class<?> type = o.getClass();
        Method[] methods = type.getMethods();
        for (Method method : methods) {
        }
    }



}
