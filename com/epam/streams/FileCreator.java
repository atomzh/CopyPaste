package com.epam.streams;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Atomzh on 14.06.2019.
 */
public class FileCreator {
    private static String directory = new String();

    public FileCreator(String a) throws FileNotFoundException {
        File file = new File(a);
        FileOutputStream fileout = new FileOutputStream(file);
        try {
            fileout.write(12345);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public FileCreator() {

    }

    public void fileWriter(String file,String something) throws FileNotFoundException {
        FileOutputStream fileout = new FileOutputStream(file);
        try {
            fileout.write(Integer.parseInt(something));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileName() throws FileNotFoundException {
        System.out.println("Введите имя файла, либо путь где вы его хотите создать");
        Scanner scan = new Scanner(System.in);
        directory = scan.next();
        FileCreator creator = new FileCreator(directory);
    }

    public void fileMessage() throws FileNotFoundException {
        System.out.println("Введите, то что вы хотите записать в этом файле");
        Scanner scan = new Scanner(System.in);
        String message = scan.next();
        fileWriter(directory,message);
    }

}
