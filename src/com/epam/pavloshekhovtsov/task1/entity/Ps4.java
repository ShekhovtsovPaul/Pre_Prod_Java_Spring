package com.epam.pavloshekhovtsov.task1.entity;

import java.util.Objects;

public class Ps4 extends GameConsole {

    private String color;
    private String disc;

    public Ps4(){}
    public Ps4(int id, double price, String category, String pack, String version, String color, String disc ) {
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
        return String.format("Ps4 : id %d, price %.3f, category %s, pack %s, version %s, color %s, disc %s",
                getId(), getPrice(), getCategory(), getPack(), getVersion(), color, disc);
    }
}
