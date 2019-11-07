package com.lti;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	int id;
	
	
	String name;
	String company;
	String color;
	float price;
	String launchDate;
	float horsePower;
	
	public Car()
	{
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}

	public float getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(float horsePower) {
		this.horsePower = horsePower;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", company=" + company + ", color=" + color + ", price=" + price
				+ ", launchDate=" + launchDate + ", horsePower=" + horsePower + "]";
	}

	
}
