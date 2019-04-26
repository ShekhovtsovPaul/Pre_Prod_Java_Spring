package com.epam.pavloshekhovtsov.task1.entity;

public class Starter {

    public static void main(String[] args) {

        GameConsole ob1 = new GameConsole(1, 300.5, "game","VR", "Pro");
        GameConsole ob2 = new GameConsole(1, 300.5, "game","VR", "Pro");

        System.out.println(ob1.equals(ob2));


        LapTop ob3 = new LapTop(1, 3, "comp", 256, "intel");
        LapTop ob4 = new LapTop(1, 3, "comp", 256, "intel");

        System.out.println(ob3 == ob4);
        System.out.println(ob3.equals(ob4));


        Technique ob5 = new Technique(1, 3, "comp");
        Technique ob6 = new Technique(1, 5.5, "comp");

        System.out.println(ob5.equals(ob6));


        Ps4 ob7 = new Ps4(1, 300.5, "game","VR", "Pro", "black", "Tekken3");
        Ps4 ob8 = new Ps4(1, 300.5, "game","VR", "Pro", "black", "Tekken3");

        ob7.setColor("Blue");

        System.out.println(ob7.hashCode());
        System.out.println(ob7);
    }

}
