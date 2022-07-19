package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class BufferWriterDemo {
    public static void main(String[] args) {

        try {
//            FileWriter fileWriter=new FileWriter("sample.txt");
//            BufferedWriter bufferWriter=new BufferedWriter(fileWriter);
//            bufferWriter.write("today is 23 march");
//            bufferWriter.close();
//            fileWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            FileReader fileReader=new FileReader("sample.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            int i= bufferedReader.read();

            while (i>0){
                System.out.println((char)i);
                i=bufferedReader.read();
            }

            bufferedReader.close();
            fileReader.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
