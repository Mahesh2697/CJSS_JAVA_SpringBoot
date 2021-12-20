public class MultiCatchException {
    public static void main(String args[]){
        try{
            int a[]={1,3,4,6};
            a[5]=10/0;
        }catch (ArithmeticException ar){
            System.out.println(ar);

        }catch (ArrayIndexOutOfBoundsException ai){
            System.out.println(ai);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}

