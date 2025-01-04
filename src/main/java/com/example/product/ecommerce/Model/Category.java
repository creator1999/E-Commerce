package com.example.product.ecommerce.Model;


public class Category extends BaseModel {
    private String categoryName;

    public Category(String category) {
        super();
        this.categoryName = category;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
