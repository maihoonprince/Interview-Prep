import java.util.*;

public class factorialUsingRecursion {
    public static long factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args){
        int num = 5;
        long result = factorial(num);
        System.out.println("Factorial is " + result);
    }
}
