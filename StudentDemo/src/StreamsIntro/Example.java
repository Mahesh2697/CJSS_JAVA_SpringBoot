package StreamsIntro;
import java.util.*;

public class Example {
    public static void main(String args[]){
        List<String> alphabets = new ArrayList<>( Arrays.asList("aa","bb", "bbb", "cac", "dog"));
        alphabets.forEach(s -> System.out.println(s));

        System.out.println("____Multiple_filters_____");

        alphabets.stream()
                .filter(s -> s.startsWith("d"))
                .filter(m -> m.endsWith("g"))
                .filter(x-> x.length()>1)
                .filter(y-> y.length()>=3).forEach(z-> System.out.println(z));
        System.out.println("--------------------------------------");

        System.out.println("____Multiple_mapping_____");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream()
                .map(number -> number*3)
                .map(e-> e*2)
                .map(e-> e*4)
                .forEach(o-> System.out.println(o));

        System.out.println("--------------------------------------");

        alphabets.stream() .mapToInt(s -> s.length()) .forEach(System.out::println);

        alphabets.stream() .mapToInt(s -> s.length()) .sum();

    }
}
