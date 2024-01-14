package com.weimin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Test17_Standard {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            String line = null;
            try {
                line = bufferedReader.readLine();
                if (!Objects.equals(line, "exit")) {
                    System.out.println(line);
                } else {
                    System.exit(0);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }

    }
}
