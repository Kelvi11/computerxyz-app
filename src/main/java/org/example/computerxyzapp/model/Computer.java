package org.example.computerxyzapp.model;

import java.time.LocalDate;

public class Computer {

    private int id;
    private String brand;
    private double price;
    private double storage;
    private double ram;
    private LocalDate releaseDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                ", ram=" + ram +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
