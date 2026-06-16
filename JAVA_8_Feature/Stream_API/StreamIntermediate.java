package JAVA_8_Feature.Stream_API;

import java.util.*;
import java.util.stream.*;

public class StreamIntermediate {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(5, 10, 20, 10, 30, 40);

        Stream<Integer> stream = number.stream()
            .filter(n -> n > 10)   // keep > 10
            .map(n -> n * 2)       // double them
            .distinct()            // remove duplicates
            .sorted();            // sort ascending
        stream.forEach(System.out::println);
    }
}