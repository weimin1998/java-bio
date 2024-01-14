package com.weimin;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Test15_RandomAccessFile {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile1 = new RandomAccessFile("src/main/resources/Test15.txt", "r");
        RandomAccessFile randomAccessFile2 = new RandomAccessFile("src/main/resources/Test15.txt", "rw");

        randomAccessFile2.seek(4);
        randomAccessFile2.write("abc".getBytes());

        byte[] bytes = new byte[20];
        int len;
        StringBuilder stringBuilder = new StringBuilder();
        while ((len = randomAccessFile1.read(bytes)) != -1) {
            stringBuilder.append(new String(bytes, 0, len));
        }

        System.out.println(stringBuilder);

        randomAccessFile2.close();
        randomAccessFile1.close();

    }
}
