package com.epam.pavloshekhovtsov.task1.entity;

public class Technique {

    private int id;
    private double price;
    private String category;
    //private BookGenre genre; ENUM

    public Technique() {}
    public Technique(int id, double price, String category) {
        this.id = id;
        this.price = price;
        this.category = category;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public double getPrice() { return price;}
    public void setPrice(double price) { this.price = price; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    @Override
    public boolean equals(Object obj) {
        Technique otherTechnique = (Technique) obj;
        return this.id == otherTechnique.id && this.price == otherTechnique.price && this.category == otherTechnique.category;
    }

}
