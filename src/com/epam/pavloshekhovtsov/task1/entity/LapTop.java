package com.epam.pavloshekhovtsov.task1.entity;

import java.util.Objects;

public class LapTop extends Technique {

    private int hdd;
    private String processor; //intel, AMD

    LapTop() {}
    LapTop(int id, double price, String category, int hdd, String processor) {
        super(id, price, category);
        this.hdd = hdd;
        this.processor = processor;
    }

    public int getHdd() { return this.hdd; }
    public void setHdd(int hdd) { System.out.println(this.hdd = hdd); }
    public String getProcessor() { return processor; }
    public void setProcessor(String processor) { System.out.println(this.processor = processor); }


    @Override
    public boolean equals(Object obj) {
        LapTop otherLapTop = (LapTop) obj;
        return this.hdd == otherLapTop.hdd && this.processor == otherLapTop.processor && super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHdd(), getProcessor());
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "hdd=" + hdd +
                ", processor='" + processor + '\'' +
                ", id='" + getId() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", category='" + getCategory() + '\'' +
                '}';
    }
}
