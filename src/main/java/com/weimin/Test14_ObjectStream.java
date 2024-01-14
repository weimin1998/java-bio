package com.weimin;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test14_ObjectStream {
    public static void main(String[] args) {

        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("src/main/resources/Test14.txt")));
            Person person = new Person("weimin", 24, "1", "2", "3");
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();

            objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get("src/main/resources/Test14.txt")));
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

class Person implements Serializable {

    private static final long serialVersionUID = 42L;
    private String name;
    private int age;

    private transient String testField;
    private String testField1;
    private String testField2;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String testField, String testField1, String testField2) {
        this.name = name;
        this.age = age;
        this.testField = testField;
        this.testField1 = testField1;
        this.testField2 = testField2;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", testField='" + testField + '\'' +
                ", testField1='" + testField1 + '\'' +
                ", testField2='" + testField2 + '\'' +
                '}';
    }
}
