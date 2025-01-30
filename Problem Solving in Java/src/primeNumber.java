import java.util.*;

public class primeNumber {
    public static void main(String[] args){
        System.out.print("Enter the number upto which you want to print PRIME NUMBER : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int num=1; num<=n; num++){
            int count = 0;
            for(int div=1; div<=num; div++){

                if(num%div == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(num);
            }
        }
    }
}
