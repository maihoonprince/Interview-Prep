package InterviewPrep;

public class fibonacciAfter20 {
    public static void main(String[] args){
        int a = 0;
        int b = 1;

        for(int i=1; i<=100; i++){
            if(a>20){
                System.out.println(a);
            }

            int c = a+b;
            b = a;
            a = c;
        }
    }
}
