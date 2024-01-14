package com.weimin;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test07_FileReaderWriter {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("src/main/resources/Test07.txt");
            fileWriter = new FileWriter("src/main/resources/Test07copy.txt", true);


            int len;
            char[] chars = new char[5];
            while ((len = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, len);
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

            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
