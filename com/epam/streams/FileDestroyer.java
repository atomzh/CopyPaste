package com.epam.streams;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Atomzh on 14.06.2019.
 */
public class FileDestroyer {
    public FileDestroyer() {
        System.out.println("Введите путь к файлу");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.next());
        file.delete();
    }
}
