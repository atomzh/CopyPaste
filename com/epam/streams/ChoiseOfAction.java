package com.epam.streams;

import java.io.IOException;
import java.util.Scanner;

public class ChoiseOfAction {
    public ChoiseOfAction() throws IOException {
        System.out.println("Введите что вы хотите сделать с файлом : creat,copy,move,destroy :");
        Scanner scan = new Scanner(System.in);
        choiseContainer(scan.next());
    }

    public void choiseContainer(String choise) throws IOException {
        switch (choise.toLowerCase()){
            case ("copy"):
                FileCopier copier = new FileCopier();
                break;
            case ("creat"):
                FileCreator creator = new FileCreator();
                break;
            case ("move"):
                FileMover move = new FileMover();
                break;
            case ("destroy"):
                FileDestroyer destroyer = new FileDestroyer();
                break;
            default:
                System.out.println("Введенного способа не существует");
                break;
        }
    }
}
