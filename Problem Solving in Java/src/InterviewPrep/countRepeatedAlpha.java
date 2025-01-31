package InterviewPrep;

public class countRepeatedAlpha {
    public static void main(String[] args){
        String str = " Prince kumar is a Student";
        char[] ch = str.toLowerCase().toCharArray();

        for(int i=0; i< ch.length; i++){
            int count = 1;

            if(ch[i] == '0' || ch[i] == ' '){
                continue;
            }

            for(int j=i+1; j<ch.length; j++){
                if(ch[i] == ch[j]){
                    ch[j] = '0';
                    count++;
                }
            }
            if(count > 1){
                System.out.println(ch[i] + " -> "+ count);
            }
        }
    }
}
