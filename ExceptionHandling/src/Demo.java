public class Demo {
    public static void main(String args[]){
        try  {
            int data = 100/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }

      try{
          String a = null;
          System.out.println(a.length());

      }catch (NullPointerException n){
          System.out.println(n);
      }


        try{
            String b = "abc";
            int i = Integer.parseInt(b);
        }catch (NumberFormatException f){
            System.out.println(f);
        }

        try{
            int c[]=new int[5];
            c[5]= 50;
        }catch (ArrayIndexOutOfBoundsException ar){
            System.out.println(ar);
        }




        }
}
