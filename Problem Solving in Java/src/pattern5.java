import java.util.*;
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args){
        System.out.println("Enter No. of Rows : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int star = 1;
        int space= n/2;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=star; j++){
                System.out.print("*");
            }

            if(i <= n/2){
                star += 2;
                space--;
            }
            else{
                star -= 2;
                space++;
            }
            System.out.println();
        }
    }
}
