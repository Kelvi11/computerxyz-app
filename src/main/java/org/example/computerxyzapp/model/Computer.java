package org.example.computerxyzapp.model;

import org.example.computerxyzapp.model.enums.Ram;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "computers")
public class Computer {

    @Id
    private int id;
    private String brand;
    private double price;
    private double storage;

    @Enumerated(EnumType.STRING)
    private Ram ram;

    @Column(name = "release_date")
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

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
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
