package InterviewPrep;

public class generateFiftyPrimeNumber {
    public static void main(String[] args){
        int n = 50;

        for(int num=1; num<=n; num++){
            int count = 0;
            for(int div=1; div<=num; div++){

                if(num % div == 0){
                    count++;
                }
            }

            if(count == 2){
                System.out.println(num);
            }
        }
    }
}
