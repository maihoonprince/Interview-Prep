import java.util.*;

public class factorialNumber  {
    public static void main(String[] args){
        System.out.print("Enter number to find its Factorial : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
