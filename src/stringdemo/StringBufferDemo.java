package stringdemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("pune");
        stringBuffer.append(" is a city");
        System.out.println(stringBuffer);


        StringBuilder stringBuilder=new StringBuilder("mumbai");
        stringBuffer.append(" is a capital of india");
        System.out.println(stringBuilder);
    }


}
