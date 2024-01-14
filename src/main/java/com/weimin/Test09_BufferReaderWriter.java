package com.weimin;

import java.io.*;

public class Test09_BufferReaderWriter {
    public static void main(String[] args) {
        FileReader fileReader;
        FileWriter fileWriter;

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileReader = new FileReader("src/main/resources/Test09.txt");
            fileWriter = new FileWriter("src/main/resources/Test09copy.txt", true);

            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);


            int len;
            char[] chars = new char[5];
            while ((len = bufferedReader.read(chars)) != -1) {
                bufferedWriter.write(chars, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
