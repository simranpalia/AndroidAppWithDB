package com.borderpass.appwithdb;

public class Product {
    private  int ProductId;
    private String ProductName;

    public Product() {}

    public Product(int id, String pName) {
        this.ProductId = id;
        this.ProductName = pName;
    }
    // properties
    public void setID(int id) {
        this.ProductId = id;
    }
    public int getID() {
        return this.ProductId;
    }
    public void setProductName(String productName) {
        this.ProductName = productName;
    }
    public String getProductName() {
        return this.ProductName;
    }
}
