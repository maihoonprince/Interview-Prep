import java.util.*;

public class palindromNumber {
    public static void main(String[] args){
        System.out.print("Enter number you want to check Palindrom No : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copyNum = num;

        int reverse = 0;
        while(num != 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;

            num = num / 10;
        }
        System.out.println("Reverse no :" + reverse);

        if(reverse == copyNum){
            System.out.println("Given number is a Palindrome Number 👍");
        }
        else{
            System.out.println("Given number is not a Palindrome Number");
        }
    }
}
