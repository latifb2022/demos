package com.lbenzzine.exceptions;
/* created by lbenzzine on 6/23/22*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) throws IOException {
            //if file does not exist program won't compile
            FileReader file = new FileReader("/Users/lbenzzine/test.txt");
            BufferedReader fileInput = new BufferedReader(file);
            for (int i = 0; i < 3; i++) {
                System.out.println(fileInput.readLine());
            }
            file.close();
        }
    }
