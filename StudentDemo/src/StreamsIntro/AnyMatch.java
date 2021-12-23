package StreamsIntro;

import java.util.Arrays;
import java.util.List;
//anyMatch() function to check whether any element in list satisfy given condition.
public class AnyMatch {


        // Driver code
        public static void main(String[] args) {

            // Creating a list of Integers
            List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

            // Stream anyMatch(Predicate predicate)
            boolean answer = list.stream().anyMatch(n
                    -> (n * (n + 1)) / 4 == 5);



            System.out.println(answer);
        }
    }

