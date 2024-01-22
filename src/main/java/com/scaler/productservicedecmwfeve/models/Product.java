package com.scaler.productservicedecmwfeve.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product extends BaseModel {
    private String title;
    private double price;
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Category category;
    private String description;
    private String imageUrl;
    private int numberOfSales;

    // public static ProductDto toDto() {
    //
    // }

    //
//    private int sachinQuestionsAsked;
}

//  1     ->     1
// Product : Category
//  m     <-     1
// --------------------
//   m      :    1

