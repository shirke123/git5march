package filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;

public class FileWriter {
    public static void main(String[] args) {
       // FileWriter fileWriter = null;
        try {
            //character stream class
            java.io.FileWriter fileWriter = new java.io.FileWriter("sample.txt");
            fileWriter.write("today is thursday");
            System.out.println("file save");
           fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try{
           FileReader fileReader=new FileReader("sample.txt");
           fileReader.read();
           int i=fileReader.read();
           while (i>0) {
               System.out.println((char) i);
               i = fileReader.read();
           }
           fileReader.close();
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
