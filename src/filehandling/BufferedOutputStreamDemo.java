package filehandling;


import java.io.*;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream1=new FileOutputStream("sample.txt");
            FileOutputStream fileOutputStream2=new FileOutputStream("text3.txt");
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
            byte[]arr="today s 23 march".getBytes();

             byteArrayOutputStream.write(arr);
             byteArrayOutputStream.writeTo(fileOutputStream1);
             byteArrayOutputStream.writeTo(fileOutputStream2);

             byteArrayOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream=new FileInputStream("sample.txt");
            FileInputStream fileInputStream2= new FileInputStream("text3.txt");
            SequenceInputStream sequenceInputStream=new SequenceInputStream(fileInputStream,fileInputStream2);

            int i=fileInputStream.read();
            while (i>0){
                System.out.println((char) i);
                i= fileInputStream.read();
            }
            fileInputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
