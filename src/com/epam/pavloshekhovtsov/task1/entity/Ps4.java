package com.epam.pavloshekhovtsov.task1.entity;

import java.util.Objects;

public class Ps4 extends GameConsole {

    private String color;
    private String disc;

    Ps4(){}
    Ps4(int id, double price, String category, String pack, String version, String color, String disc ) {
        super(id, price, category, pack, version);
        this.color = color;
        this.disc = disc;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getDisc() { return disc; }
    public void setDisc(String disc) {  this.disc = disc; }


    @Override
    public boolean equals(Object obj) {
        Ps4 otherPs4 = (Ps4) obj;
        return this.color == otherPs4.color && this.disc == otherPs4.disc && super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, disc);
    }

    @Override
    public String toString() {
        return "Ps4{" +
                "color=`" + color + '\'' +
                ", disc='" + disc + '\'' +
                ", id='" + getId() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", pack'" + getPack() + '\'' +
                ", version'" + getVersion() + '\'' +
                '}';
    }
}
