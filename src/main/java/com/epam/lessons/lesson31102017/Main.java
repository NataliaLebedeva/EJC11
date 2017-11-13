package com.epam.lessons.lesson31102017;

/**
 * Created by Nata on 31.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getColor("GREEN"));
        System.out.println(main.getColor("BLUE"));

        String color = "YELLOW";
//        for(Color color : Color.vaues()){
//            if (color == Color.GREEN){
//                System.out.println(color);
//            } else if (color == Color.YELLOW){
//                System.out.println(color);
//            } else if (color == Color.RED) {
//                System.out.println(color);
//            }
//
//            throw new IllegalArgumentException("Message" + color);
//        }

    }

    private String getColor(String color) {
        for (Color color2 : Color.values()) {
            if (color2.toString() == color) {
                return color;
            }
        }

        throw new IllegalArgumentException("Incorrect" + color);
    }
}
