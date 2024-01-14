package com.weimin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 处理非文本文件
public class Test01_FileInputOutputStream {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("src/main/resources/Test01.jpg");
            fileOutputStream = new FileOutputStream("src/main/resources/Test01copy.jpg");

            int len;
            byte[] bytes = new byte[100];
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }


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
