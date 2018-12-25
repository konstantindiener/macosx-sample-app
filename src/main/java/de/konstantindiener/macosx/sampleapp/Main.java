package de.konstantindiener.macosx.sampleapp;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow("macOS Text Edit");
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
        mainWindow.setSize(new Dimension(400,300));
    }
}
