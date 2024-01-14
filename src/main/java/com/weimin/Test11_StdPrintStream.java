package com.weimin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test11_StdPrintStream {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream;
        PrintStream printStream = null;
        try {
            fileOutputStream = new FileOutputStream("src/main/resources/Test11.txt");
            printStream = new PrintStream(fileOutputStream);

            System.setOut(printStream);

            System.out.println("test print stream");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (printStream != null) {
                printStream.close();
            }
        }

    }
}
