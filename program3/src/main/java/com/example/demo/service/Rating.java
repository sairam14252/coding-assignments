package com.example.demo.service;

import javax.persistence.Entity;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
@Entity
public class Rating {
	

	private int id;
	private String firsName;
	private float customerAverageRating;
	private float averageRating;

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public float getCustomerAverageRating() {
		return customerAverageRating;
	}

	public void setCustomerAverageRating(float customerAverageRating) {
		this.customerAverageRating = customerAverageRating;
	}

	public float getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}

	@Override
	public String toString() {
		return "Rating [id=" + id + ", firsName=" + firsName + ", customerAverageRating=" + customerAverageRating
				+ ", averageRating=" + averageRating + ", getId()=" + getId() + ", getFirsName()=" + getFirsName()
				+ ", getCustomerAverageRating()=" + getCustomerAverageRating() + ", getAverageRating()="
				+ getAverageRating() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
