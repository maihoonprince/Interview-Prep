import java.util.*;

public class reverseNumber {
    public static void main(String[] args){
        System.out.print("Enter the number you want to Reverse : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;

        while(num != 0){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;

            num = num / 10;
        }
        System.out.println(reverse);

    }
}
