package java8;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 25/08/2016.
 */
public class MainCountWordsInFile {
    @SneakyThrows
    public static void main(String[] args) {
        Stream<String> lines = Files.lines(Paths.get("data/songs/pink floyd/animals.txt"));
        OptionalDouble optionalDouble = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                .filter(s -> !s.isEmpty()).peek(System.out::println).mapToInt(String::length).average();
        if (optionalDouble.isPresent()) {
            System.out.println(optionalDouble.getAsDouble());
        }else {
            System.out.println("file was empty");
        }
    }
}
