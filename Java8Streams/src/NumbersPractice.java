import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class NumbersPractice {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
        numbers.stream().forEach(x-> {
            if (x%3 ==0)
            {

                System.out.println(x);

              // System.out.println(x*2);

            }
            });
        System.out.println("----------------------------------------");
        numbers.stream().forEach(y-> {
            if(y%5==0){
                System.out.println(y);
            }
        });

        System.out.println("----------------------------------------");
        IntSummaryStatistics num = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(num.getSum());

    }
}
