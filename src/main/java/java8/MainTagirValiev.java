package java8;

import one.util.streamex.StreamEx;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 25/08/2016.
 */
public class MainTagirValiev {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<String> strings = Arrays.asList("one", "two", "three");
        StreamEx<Item> mixedStream =
                StreamEx.zip(integers, strings, (i, s) -> new Item(s, i));
        mixedStream.forEach(System.out::println);
    }
}
