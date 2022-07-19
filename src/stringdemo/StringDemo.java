package stringdemo;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        char[] arr={'w','e','l','l'};
//        String str=new String(arr);

//        String str1= new String("green");
//        String str2=new String("red");
//        String str3="red";
//        String str4="green";
//        String str5="yellow";
//        String str6=new String("yellow");
//        String str7=new String("red");

        String str="";
        String str1="pune";
        String str2="mumbai";
        String str3="pune";

        System.out.println(str);
        System.out.println(Arrays.toString(str.getBytes()));
//        System.out.println(str.charAt(0));
        System.out.println(str.compareTo("mumbai"));  //-6
        System.out.println(str.contains("p")); //false
        System.out.println(str.compareToIgnoreCase("MuMbai")); //-6

        str=str.concat("is a capital of maha");
        System.out.println(str.subSequence(1,4)); //s a
        System.out.println(str.substring(3,5)); //a
        System.out.println(str);

        System.out.println(str.trim());
        System.out.println(str.indexOf("u")); //-1
        System.out.println(str.isBlank());  //true
        System.out.println(str.isEmpty()); //true



    }
}
