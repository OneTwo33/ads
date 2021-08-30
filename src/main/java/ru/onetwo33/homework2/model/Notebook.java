package ru.onetwo33.homework2.model;

public class Notebook {

    private Brand brand;
    private Integer price;
    private Integer ram;

    public Notebook(Brand brand, Integer price, Integer ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand=" + brand +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }
}
