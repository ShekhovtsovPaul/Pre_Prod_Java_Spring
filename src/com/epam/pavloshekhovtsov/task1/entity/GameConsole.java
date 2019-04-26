package com.epam.pavloshekhovtsov.task1.entity;

import java.util.Objects;

public class GameConsole extends Technique {

    private String pack; // joistick 1 or 2, VR,
    private String version; // pro or slim

    GameConsole(){}
    GameConsole(int id, double price, String category, String complect, String version) {
        super(id, price, category);
        this.pack = complect;
        this.version = version;
    }

    public String getPack() { return pack; }
    public void setPack(String pack) {  System.out.println(this.pack = pack); }
    public String getVersion() { return version; }
    public void setVersion(String version) { System.out.println(this.version = version); }


    @Override
    public boolean equals(Object obj) {
        GameConsole otherGameConsole = (GameConsole) obj;
        return this.pack == otherGameConsole.pack && this.version == otherGameConsole.version && super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pack, version);
    }

    @Override
    public String toString() {
        return "GameConsole{" +
                "pack='" + pack + '\'' +
                ", version='" + version + '\'' +
                ", id='" + getId() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", category='" + getCategory() + '\'' +
                '}';
    }
}
