package com.weimin;

import java.io.*;

public class Test18_Zhuanhuan {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            fileInputStream = new FileInputStream("src/main/resources/Test18in.txt");
            fileOutputStream = new FileOutputStream("src/main/resources/Test18out.txt");

            inputStreamReader = new InputStreamReader(fileInputStream);
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK");

            char[] chars = new char[1024];
            int len;

            while ((len = inputStreamReader.read(chars)) != -1) {
                outputStreamWriter.write(chars, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            if (outputStreamWriter != null) {
                try {
                    outputStreamWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
