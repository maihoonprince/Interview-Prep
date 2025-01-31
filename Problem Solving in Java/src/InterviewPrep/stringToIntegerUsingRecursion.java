package InterviewPrep;

public class stringToIntegerUsingRecursion {
    public static int stringToInteger(String str, int length){
        if (length == 0){
            return 0;
        }

        int lastInteger = str.charAt(length-1) - '0';
        return stringToInteger(str, length - 1) * 10 + lastInteger;
    }

    public static void main(String[] args){
        String str = "0032454";
        int result = stringToInteger(str, str.length());
        System.out.println("Converted Result is " + result);
    }
}