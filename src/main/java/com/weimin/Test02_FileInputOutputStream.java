package com.weimin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 处理非文本文件
public class Test02_FileInputOutputStream {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("src/main/resources/Test02.mp4");
            fileOutputStream = new FileOutputStream("src/main/resources/Test02copy.mp4");


            long start = System.currentTimeMillis();

            int len;
            byte[] bytes = new byte[1024];
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }

            System.out.println("copy end");

            long end = System.currentTimeMillis();

            System.out.println("花费时间：" + (end - start)); //花费时间：ms

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
