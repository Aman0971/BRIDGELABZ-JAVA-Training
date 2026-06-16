package JAVA_8_Feature.Stream_API;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Creation0fStream {
    public static void main(String[] args){

        // Stream from collection class
        List<String> list = Arrays.asList("java","aman","hello");
        Stream<String> stream = list.stream();

        // Stream from array
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> stream1 = Arrays.stream(arr);

        // direct stream 
        Stream<Integer>  stream2 = Stream.of(1,2,3,4,5);

        // infinite Stream  
        Stream<Integer> stream3 = Stream.iterate(1, n -> n+1).limit(5);  
         /* limit() method  se hum infinite ko rokte hai */
        stream3.forEach(x -> System.out.println(x));
    }
}
