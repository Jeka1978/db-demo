package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Evegeny on 25/08/2016.
 */
public class MainFilter {
    public static void main(String[] args) {
        String personToFire = "Vova";
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Vova", "Tanya", "Maksim", "Anya"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals(personToFire)) {
                iterator.remove();
            }
        }
        list.removeIf(s -> s.equals(personToFire));
        System.out.println(list);
    }
}
