package com.weimin;

import java.io.FileReader;
import java.io.IOException;

public class Test04_FileReader {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/main/resources/Test04.txt");

            char[] chars = new char[5];

            // Reads characters into an array. This method will block until some input is available, an I/O error occurs, or the end of the stream is reached.
            //Params:
            //cbuf – Destination buffer
            //Returns:
            //The number of characters read, or -1 if the end of the stream has been reached
            int len;
            StringBuilder stringBuilder = new StringBuilder();
            while ((len = fileReader.read(chars)) != -1) {
                stringBuilder.append(chars, 0, len);
            }
            System.out.println(stringBuilder);

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
