import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String args[]){
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        System.out.println("-------------------------------");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squareRoots = numbers.stream().map(i-> i*i).collect(Collectors.toList());
        System.out.println(squareRoots);

        List<String> strings = Arrays.asList("abc", "bcd","abc", "jds","","");
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);

//        strings.forEach(x-> {
//            System.out.println(x);
//        });


        List<String> string = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = string.stream().filter(str -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("Filtered List: " + filtered);
        String mergedString = string.stream().filter(str-> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);
    }

}
