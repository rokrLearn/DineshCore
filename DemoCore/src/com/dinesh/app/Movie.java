package com.dinesh.app;

import java.util.Date;

public class Movie implements Comparable<Movie>{

	private int year;
	private String name;
	private float rating;
	private Date dt;
	
	public Movie(int year, String name, float rating, Date dt) {
		super();
		this.year = year;
		this.name = name;
		this.rating = rating;
		this.dt = dt;
	}
	
	public int getYear() {
		return year;
	}
	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public String getName() {
		return name;
	}
	public float getRating() {
		return rating;
	}
	
	public int compareTo(Movie m) {
		return year - m.getYear();
	}

	@Override
	public String toString() {
		return "Movie [year=" + year + ", name=" + name + ", rating=" + rating + ", date="+ dt+"]";
	}

}
