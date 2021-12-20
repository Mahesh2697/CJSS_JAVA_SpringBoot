public class UserDefinedException {

    public static void main(String args[]){
       int age = 67;
        if (age>60){
            throw new TooOldException("Age must be below 60");
        }
        else if (age<18){
            throw new TooYoungException("Age must be more than 18");
        }
        else System.out.println("you are eligible");

        int amount =99;
        if (amount == 0){
            throw  new ZeroBalanceAvailable("ZeroBalanceAvailable");

        }
        else if (amount<100){
            throw  new InvalidAmount("invalid amount");
        }
        else if(amount == amount){
            throw new AvailableBalance("AvailableBalance"+" "+amount);
        }

        else {
            System.out.println("successfully done");
        }


    }

    static class ZeroBalanceAvailable extends RuntimeException{
        ZeroBalanceAvailable(String msg){
            super(msg);
        }
    }
    static class AvailableBalance extends RuntimeException{
        AvailableBalance(String msg){
            super(msg);
        }
    }
    static class InvalidAmount extends RuntimeException{
        InvalidAmount(String msg){
            super(msg);
        }
    }


    static class TooYoungException extends  RuntimeException{
        TooYoungException(String msg){
            super(msg);
        }
    }
    static class TooOldException extends RuntimeException {
        TooOldException(String msg) {
            super(msg);
        }

    }
}



