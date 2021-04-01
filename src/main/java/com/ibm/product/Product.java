package com.ibm.product;

import java.sql.Date;

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
    private String holiday_type;
    private Date departure_date;
    private Date return_date;

    public Product() {

    }

    public Product(int id, String title, String description, String thumbnail_url, int quantity, float price, String country, String holiday_type, Date departure_date, Date return_date) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnail_url = thumbnail_url;
        this.quantity = quantity;
        this.price = price;
        this.country = country;
        this.holiday_type = holiday_type;
        this.departure_date = departure_date;
        this.return_date = return_date;
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

    public String getHoliday_type() {
        return holiday_type;
    }

    public void setHoliday_type(String holidayType) {
        this.holiday_type = holidayType;
    }

    public Date getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(Date departureDate) {
        this.departure_date = departureDate;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date returnDate) {
        this.return_date = returnDate;
    }

}
