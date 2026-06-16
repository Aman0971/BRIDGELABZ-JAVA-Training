package JAVA_8_Feature.Stream_API;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStream {
   public static void main(String[] args){
    
    //convert in array
    Stream<Integer> stream1 =  Stream.of(1,2,3,4,5);
    Integer[] arr = stream1.toArray(Integer[]::new);
    System.out.println(Arrays.toString(arr));

    // convert in list
    Stream<Integer> stream2 =  Stream.of(1,2,3,4,5);
    List<Integer> list = stream2.collect(Collectors.toList());
      /* for java 16+
        List<Integer> list = stream1.toList()) */
    System.out.println(list); 
    
    // convert stream to string 
    Stream<String> stream3 = Stream.of("Java", "Python", "C++");

       /*  Merges into one string separated by commas */
    String result = stream3.collect(Collectors.joining(", "));
    System.out.println(result);
   } 
}
