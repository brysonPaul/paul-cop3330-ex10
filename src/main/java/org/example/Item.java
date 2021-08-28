package org.example;

public class Item
{
    int price;
    int quantity;

    public int getPrice() {
        return this.price;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Item(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
    public Item()
    {
        this.price = 0;
        this.quantity = 0;
    }
}
