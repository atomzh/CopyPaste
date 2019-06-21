package com.epam.streams;

import java.io.*;
import java.util.Scanner;

public class FileCreator {
    private static String directory ;

    public FileCreator() throws IOException {
        fileName();
        fileMessage();
    }

    public void fileWriter(String something) throws IOException {
        BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream(directory));
        try {
            byte[] buffer = something.getBytes();
            bf.write(buffer,0,buffer.length);
        }
        finally {
            bf.close();
        }
    }

    public void fileName() throws FileNotFoundException {
        System.out.println("Введите имя файла, либо путь где вы его хотите создать");
        Scanner scan = new Scanner(System.in);
        directory = scan.next();
    }

    public void fileMessage() throws IOException {
        System.out.println("Введите, что вы хотите записать в файле");
        Scanner scan = new Scanner(System.in);
        String message = scan.next();
        fileWriter(message);
        scan.close();
    }

}
