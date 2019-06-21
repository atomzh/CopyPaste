package com.epam.streams;

import java.io.*;
import java.util.Scanner;

public class FileMover {
    private String copyOfFile ;
    private static File directoryForCopy;
    private static File directoryForMove;

    public FileMover() throws IOException {
        namesOfFile();
    }

    public void namesOfFile() throws IOException {
        System.out.println("Укажите путь к файлу, который хотите переместить");
        Scanner scanner = new Scanner(System.in);
        directoryForCopy= new File(scanner.next());
        System.out.println("Укажите путь, куда хотите переместить файл");
        String forMove =scanner.next();
        directoryForMove= new File(forMove+"\\"+directoryForCopy.getName());
        copyFile(directoryForCopy,directoryForMove);
        directoryForCopy.delete();
    }

    public void copyFile(File original, File copy) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try{
            in = new FileInputStream(original);
            out = new FileOutputStream(copy);
            int lenght;
            byte[] buff = new byte[1024];
            while ((lenght = in.read(buff))>0){
                out.write(buff, 0 , lenght);
            }
        }finally {
            in.close();
            out.close();
        }


    }
}
