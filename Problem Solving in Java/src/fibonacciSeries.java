import java.util.*;

public class fibonacciSeries {
    public static void main(String[] args){
        System.out.print("Enter the number of Fibonacci No you want to print : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        for(int i=1; i<=n; i++){
            System.out.println(a);

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
