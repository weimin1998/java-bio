package com.weimin;

import java.io.*;

public class Test12_ObjectStream {
    public static void main(String[] args) {
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/Test12.txt"));
            objectOutputStream.writeObject("weimin");
            objectOutputStream.flush();

            objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/Test12.txt"));
            Object o = objectInputStream.readObject();
            System.out.println(o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
