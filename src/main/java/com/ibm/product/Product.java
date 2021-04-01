package com.ibm.product;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    /*
    	id int,
	title text NOT NULL,
	description text NOT NULL,
	thumbnail_url text NOT NULL,
	quantity int NOT NULL,
	price float NOT NULL,
	country text NOT NULL,
	holiday_type text NOT NULL,
	departure_date date NOT NULL,
	return_date date NOT NULL,
    */ 
    @Id
    private int id;
    private String title;
    private String description;
    private String thumbnail_url;
    private int quantity;
    private float price;
    private String country;
    private String holidayType;
    private LocalDate departureDate;
    private LocalDate returnDate;

    public Product() {

    }

    public Product(int id, String title, String description, String thumbnail_url, int quantity, float price,String country,String holidayType,LocalDate departureDate,LocalDate returnDate) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnail_url = thumbnail_url;
        this.quantity = quantity;
        this.price = price;
        this.country = country;
        this.holidayType = holidayType;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHolidayType() {
        return holidayType;
    }

    public void setHolidayType(String holidayType) {
        this.holidayType = holidayType;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

}
