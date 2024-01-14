package com.weimin;

import java.io.*;

public class Test13_DataInputOutput {
    public static void main(String[] args) {
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream("src/main/resources/Test13.txt"));

            dataOutputStream.writeUTF("weimin");
            dataOutputStream.flush();
            dataOutputStream.writeInt(1);
            dataOutputStream.flush();
            dataOutputStream.writeBoolean(false);
            dataOutputStream.flush();

            dataInputStream = new DataInputStream(new FileInputStream("src/main/resources/Test13.txt"));

            String s = dataInputStream.readUTF();
            int i = dataInputStream.readInt();
            boolean aBoolean = dataInputStream.readBoolean();

            System.out.println(aBoolean);
            System.out.println(i);
            System.out.println(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
