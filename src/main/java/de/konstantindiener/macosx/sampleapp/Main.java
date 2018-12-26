package de.konstantindiener.macosx.sampleapp;

import com.apple.eawt.AppEvent;
import com.apple.eawt.Application;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.List;

import static javax.swing.SwingUtilities.invokeLater;

public class Main {

    public static void main(String[] args) {

        final MainWindow mainWindow = new MainWindow("macOS Text Edit");

        Application application = Application.getApplication();
        System.out.println(application);
        application.setOpenFileHandler((AppEvent.OpenFilesEvent openFilesEvent) -> {
                System.out.println("test");

            List<File> files = openFilesEvent.getFiles();
            final String fileNames = files.stream()
                    .map(File::getAbsolutePath)
                    .reduce(", ", String::concat);
            invokeLater(() -> mainWindow.setText(fileNames));
        });

        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
        mainWindow.setSize(new Dimension(400,300));
    }
}
