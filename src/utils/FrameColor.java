package utils;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class FrameColor extends JFrame {

    public FrameColor(Consumer<Color> colorCallback) {
        setTitle("Choose Your Pseudo Color");
        setSize(450, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JColorChooser colorChooser = new JColorChooser();
        add(colorChooser, BorderLayout.CENTER);

        JButton applyButton = new JButton("Apply Color");
        applyButton.addActionListener(e -> {
            Color selectedColor = colorChooser.getColor();
            colorCallback.accept(selectedColor);
            dispose();
        });

        add(applyButton, BorderLayout.SOUTH);
        setVisible(true);
    }
}
