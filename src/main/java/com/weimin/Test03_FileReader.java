package com.weimin;

import java.io.FileReader;
import java.io.IOException;

public class Test03_FileReader {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/main/resources/Test03.txt");

            // 从文件中读取一个字符
            //Reads a single character.
            //Returns:
            //The character read, or -1 if the end of the stream has been reached
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
