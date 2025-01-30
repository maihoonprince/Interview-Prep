import java.util.*;

public class isArmstrongNumber {
    public static void main(String[] args){
        System.out.print("Enter the Number : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copyNum = num;
        int result = 0;

        while(num != 0){
            int rem = num % 10;
            result = (rem * rem * rem) + result;
            num = num / 10;
        }

        if(result == copyNum){
            System.out.println("Yes, " + copyNum + " is a Armstrong Number");
        }
        else{
            System.out.println("Inputed number is not a Armstrong Number");
        }
    }
}
