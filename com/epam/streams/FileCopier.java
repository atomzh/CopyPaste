package com.epam.streams;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Atomzh on 14.06.2019.
 */
public class FileCopier {

    private String copyOfFile;
    private static File directoryForCopy;
    private static File directoryForMove;

    public FileCopier() throws IOException {
        System.out.println("Укажите путь к файлу, который хотите скопировать");
        Scanner scanner = new Scanner(System.in);
        directoryForCopy = new File(scanner.next());
        System.out.println("Укажите путь, куда хотите переместить скопированный файл");
        directoryForMove = new File(scanner.next());
        copyFile(directoryForCopy, directoryForMove);
    }

    public void copyFile(File original, File copy) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(original);
            out = new FileOutputStream(copy);
            byte[] buffer = new byte[1024];
            int lenght;
            while ((lenght = in.read(buffer)) > 0) {
                out.write(buffer, 0, lenght);
            }
        } finally {
            in.close();
            out.close();
        }

    }
}
