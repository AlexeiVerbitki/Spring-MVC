package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_16.Chapter_16_Exercise;

import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public interface myColor {

     default Color choose(String colorKey) {

        Color selectedColor=null;



            Map<String, Color> colorMap = new TreeMap<>();
            colorMap.put("white", Color.WHITE);
            colorMap.put("blue", Color.blue);
            colorMap.put("magenta", Color.magenta);
            colorMap.put("cyan", Color.cyan);
            colorMap.put("green", Color.green);
            colorMap.put("yellow", Color.yellow);
            colorMap.put("orange", Color.orange);
            colorMap.put("red", Color.red);
            if (colorMap.containsKey(colorKey))
                selectedColor = colorMap.get(colorKey);
            else
                System.out.printf("No such color");
            return selectedColor;
        }
    }

