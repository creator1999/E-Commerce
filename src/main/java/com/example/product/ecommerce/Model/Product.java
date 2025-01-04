package com.example.product.ecommerce.Model;





public class Product {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    private String title;
    private String price;
    private Category category;
    public Product(String id, String title, String price, Category category) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.category = category;
    }


}
