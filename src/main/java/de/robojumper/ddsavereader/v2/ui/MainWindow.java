package de.robojumper.ddsavereader.v2.ui;

import de.robojumper.ddsavereader.BuildConfig;
import de.robojumper.ddsavereader.v2.ui.components.hero.icon.HeroIconUIComponent;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class MainWindow {
    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow window = new MainWindow();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private MainWindow() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(BuildConfig.DISPLAY_NAME + "/" + BuildConfig.VERSION);
        frame.add(new HeroIconUIComponent("plague_doctor", 2));
        frame.setVisible(true);
    }
}
