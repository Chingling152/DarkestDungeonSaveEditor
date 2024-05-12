package de.robojumper.ddsavereader.v2.ui.components.hero.icon;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class HeroIconUIComponent extends JPanel {
    private final String heroClass;
    private final Integer colorVariant;

    public HeroIconUIComponent(String heroClass, Integer colorVariant)
    {
        super();
        this.heroClass = heroClass;
        this.colorVariant = colorVariant;
        this.initialize();
    }

    private String getPath(){
        return this.heroClass + "/" + this.heroClass + "_portrait_roster_" + this.colorVariant.toString() + ".png";
    }

    private void initialize(){
        try {
            BufferedImage image = ImageIO.read(Objects.requireNonNull(getClass().getResource(this.getPath())));
            JLabel picLabel = new JLabel(new ImageIcon(image));
            picLabel.setVisible(true);
            this.add(picLabel);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
