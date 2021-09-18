package com.filehandle;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {

    public static void main(String[] args) {

        File file = new File("//Users//neal//Documents//hello//hello2.rtf");
        try {
            if (file.createNewFile()) {
                System.out.println("File successfully created");
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException i) {
            System.out.println("Exception Handled");
        }
    }
}
