package com.epam.pavloshekhovtsov.task1.entity;

import com.epam.pavloshekhovtsov.task1.list.MyList;

import java.util.ArrayList;
import java.util.List;

public class Starter2 {

    public static void main(String[] args) {

        //arrayListExamples();
        List<Technique> techniqueList = new MyList<>();
        Technique tech1 = new Technique(1, 300, "TV");
        LapTop pc1 = new LapTop(1, 1400, "PC", 512, "intel");
        GameConsole console1 = new GameConsole(1, 200, "Game", "VR", "slim" );
        Ps4 ps41 = new Ps4(1, 300, "game", "VR, stereo", "pro", "white", "MK");
        techniqueList.add(tech1);
        techniqueList.add(ps41);
        techniqueList.add(console1);
        techniqueList.add(pc1);

        for(int i = 0; i < techniqueList.size(); i++) {
            System.out.println(techniqueList.get(i));
        }
    }

    public static void arrayListExamples() {

        ArrayList<Technique> tech = new ArrayList();
        Technique tech1 = new Technique(1, 300, "TV");
        Technique tech2 = new Technique(2, 400, "Mobile");
        Technique tech3 = new Technique(3, 500, "DVD");
        Technique tech4 = new Technique(3, 500, "DVD");

        ArrayList<LapTop> pc = new ArrayList();
        LapTop pc1 = new LapTop(1, 1400, "PC", 512, "intel");
        LapTop pc2 = new LapTop(2, 1500, "PC", 512, "AMD");
        LapTop pc3 = new LapTop(3, 1600, "PC", 1024, "intel");

        ArrayList<GameConsole> consoles = new ArrayList();
        GameConsole console1 = new GameConsole(1, 200, "Game", "VR", "slim" );
        GameConsole console2 = new GameConsole(2, 300, "Game", "stereo", "slim" );
        GameConsole console3 = new GameConsole(3, 400, "Game", "VR", "pro" );

        ArrayList<Ps4> ps4s = new ArrayList();
        Ps4 ps41 = new Ps4(1, 300, "game", "VR, stereo", "pro", "white", "MK");
        Ps4 ps42 = new Ps4(1, 300, "game", "VR, stereo", "pro", "white", "MK");
        Ps4 ps43 = new Ps4(2, 300, "game", "VR, stereo", "pro", "black", "MK");

    }
}

