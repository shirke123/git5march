package filehandling;

import java.io.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Admin\\IdeaProjects\\fullstackjava-test.java\\src\\filehandling\\test.txt");
        // byte stream

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\fullstackjava-test.java\\src\\filehandling\\test.txt");
            String str = "today is wednesday";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("file write successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\fullstackjava-test.java\\src\\filehandling\\test.txt");
        int i= fileInputStream.read();

         while (i > 0) {
                System.out.println((char)i);
             i = fileInputStream.read();

            }
        }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

