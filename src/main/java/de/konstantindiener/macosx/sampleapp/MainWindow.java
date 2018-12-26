package de.konstantindiener.macosx.sampleapp;

import javax.swing.*;
import java.awt.*;

class MainWindow extends JFrame {

    private JTextArea textArea = new JTextArea();

    MainWindow(String title) throws HeadlessException {
        super(title);

        initUi();
    }

    private void initUi() {
        setLayout(new BorderLayout());

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    void setText(String text) {
        textArea.setText(text);
    }
}
