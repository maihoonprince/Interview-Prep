package InterviewPrep;

import org.w3c.dom.ls.LSOutput;

public class largestAndSmallestElementOfArray {
    public static void main(String[] args){
        int[] arr = {2,4,5,3,1,6};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min Element : " + min);
        System.out.println("Max Element : " + max);
    }

}
