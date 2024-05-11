package de.robojumper.ddsavereader.v2.ui.components.hero.icon;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class HeroIconUIComponent extends JComponent {
    private final String heroClass;
    private final Integer colorVariant;

    public HeroIconUIComponent(String heroClass, Integer colorVariant)
    {
        super();
        this.heroClass = heroClass;
        this.colorVariant = colorVariant;
        this.initialize();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100);
    }

    private void initialize(){
        this.setSize(100, 100);
        try {
            BufferedImage image = ImageIO.read(Objects.requireNonNull(getClass().getResource("plague_doctor/plague_doctor_portrait_roster_0.png")));
            JLabel picLabel = new JLabel();
            picLabel.setIcon(new ImageIcon(image));
            picLabel.setText("jLabel");
            picLabel.setVisible(true);
            add(picLabel);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
