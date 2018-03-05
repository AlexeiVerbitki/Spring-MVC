package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_16.Chapter_16_Exercise;

import javafx.beans.binding.MapBinding;

import java.awt.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
16.15 (Color Chooser) Use a HashMap to create a reusable class for choosing one of the 13 predefined
colors in class Color. The names of the colors should be used as keys, and the predefined
Color objects should be used as values. Place this class in a package that can be imported into any
Java program. Use your new class in an application that allows the user to select a color and draw a
shape in that color.
*/

public class Color_Chooser_16_15 implements myColor {
    Map<String, Color> colorMap = new TreeMap<>();

    public Color selectedColor;

    public Color_Chooser_16_15() {

        colorMap.put("white", Color.WHITE);
        colorMap.put("blue", Color.blue);
        colorMap.put("magenta", Color.magenta);
        colorMap.put("cyan", Color.cyan);
        colorMap.put("green", Color.green);
        colorMap.put("yellow", Color.yellow);
        colorMap.put("orange", Color.orange);
        colorMap.put("red", Color.red);
    }
@Override
    public Color choose(String colorKey) {
//
        if (colorMap.containsKey(colorKey))
            selectedColor = colorMap.get(colorKey);
        else
            System.out.printf("No such color");
        return selectedColor;
    }

    @Override
    public String toString() {
        String key = "";
        for (Map.Entry<String, Color> value : colorMap.entrySet()) {
            if (value.getValue() == selectedColor)
                key = value.getKey();

        }
//                String.format("%s",colorMap.entrySet());
        return key;
    }

    public static void main(String[] args) {
        Color_Chooser_16_15 color = new Color_Chooser_16_15();

        color.choose("white");
        System.out.printf("\nSelected color:\n%s", color);
    }
}
