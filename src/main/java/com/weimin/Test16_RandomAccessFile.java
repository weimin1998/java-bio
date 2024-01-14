package com.weimin;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Test16_RandomAccessFile {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile1 = new RandomAccessFile("src/main/resources/Test16.txt", "r");

        randomAccessFile1.seek(6);


        byte[] bytes = new byte[20];
        int len;
        StringBuilder stringBuilder = new StringBuilder();
        while ((len = randomAccessFile1.read(bytes)) != -1) {
            stringBuilder.append(new String(bytes, 0, len));
        }

        System.out.println(stringBuilder);
        randomAccessFile1.close();

    }
}
