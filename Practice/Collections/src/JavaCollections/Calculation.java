package JavaCollections;

public class Calculation {
    public static void main(String args[]) {
        a:
        for (int i = 0; i <= 5; i++) {
            b:
            for (int j = 0; j <=7; j++) {
                c:
                for (int k = 0; k <= 5; k++) {
                    System.out.println(k);
                    if(k==8){
                        break b;
                        System.out.println("------------");
                    }

                }
            }

        }

    }
}
