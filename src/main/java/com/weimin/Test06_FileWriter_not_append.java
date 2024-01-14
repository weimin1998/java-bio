package com.weimin;

import java.io.FileWriter;
import java.io.IOException;

public class Test06_FileWriter_not_append {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("src/main/resources/Test06.txt", false);

            fileWriter.write("weimin\n");

            fileWriter.write("さくら\n");


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
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
