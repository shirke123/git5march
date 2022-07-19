package interviewquestions;

public class ReverseString {
    public static void main(String[] args) {
        String str="I Am developer and also engineer";
        String[] strings=str.split("");

        for( int i=strings.length-1;i>=0;i--){
            System.out.println(strings[i]+"");
        }

    }
}
