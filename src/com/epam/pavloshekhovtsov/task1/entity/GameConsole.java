package com.epam.pavloshekhovtsov.task1.entity;

import java.util.Objects;

public class GameConsole extends Technique {

    private String pack; // joistick 1 or 2, VR,
    private String version; // pro or slim

    public GameConsole(){}
    public GameConsole(int id, double price, String category, String pack, String version) {
        super(id, price, category);
        this.pack = pack;
        this.version = version;
    }

    public String getPack() { return pack; }
    public void setPack(String pack) {  System.out.println(this.pack = pack); }
    public String getVersion() { return version; }
    public void setVersion(String version) { System.out.println(this.version = version); }


    @Override
    public boolean equals(Object obj) {
        GameConsole otherConsol = (GameConsole) obj;
        return this.pack == otherConsol.pack && this.version == otherConsol.version
                && super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pack, version);
    }

    @Override
    public String toString() {
        return String.format("GC : id = %d, price = %f.3, category = %s, pack = %s, version = %s",
                getId(), getPrice(), getCategory(), pack, version );
    }
}
