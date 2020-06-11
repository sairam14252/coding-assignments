package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Rating;


@RestController
public class Movie {

	@Autowired
	public Rating ratingClass;

	@GetMapping(value = "path/api/rest/customer/{id}/rate/{rating}", produces = "application/json")
	public Rating customerRating(@PathVariable("id") int id, @PathVariable("rating") float rating) {
		System.out.println(id + "," + rating);

		ratingClass.setId(id);
		ratingClass.setCustomerAverageRating(rating);

		System.out.println(ratingClass);
		return ratingClass;

	}

}
