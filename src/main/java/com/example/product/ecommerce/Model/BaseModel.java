package com.example.product.ecommerce.Model;



import java.time.LocalDate;
import java.util.Date;

public class BaseModel {
    private LocalDate created;
    private LocalDate updated;

    public BaseModel (){
       created= LocalDate.now();
       updated= LocalDate.now();


    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }
}
