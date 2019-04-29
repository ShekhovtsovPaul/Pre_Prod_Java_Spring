package com.epam.pavloshekhovtsov.task1.entity;

public class Technique {

    private int id;
    private double price;
    private String category;

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
        Technique otherTecniq = (Technique) obj;
        return this.id == otherTecniq.id && this.price == otherTecniq.price
                && this.category == otherTecniq.category;
    }

    @Override
    public String toString() {
        return String.format("Technique : id = %d, price = %.3f, category = %s \n", id, price, category);
    }


    public static void main(String[] args) {
        Technique prod = new Technique(3, 500.600, "TV");
        Technique prod2 = new Technique(3, 500.600, "TV");

        System.out.println(prod.toString());
        System.out.println(prod.equals(prod2));
    }
}
