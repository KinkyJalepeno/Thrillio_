package com.kinky.thrillio.entities;

public class Movie extends Bookmark {

	private int realeaseYear;
	private String[] cast;
	private String[] directors;
	private String genre;
	private double imdbRating;

	public int getRealeaseYear() {
		return realeaseYear;
	}

	public void setRealeaseYear(int realeaseYear) {
		this.realeaseYear = realeaseYear;
	}

	public String[] getCast() {
		return cast;
	}

	public void setCast(String[] cast) {
		this.cast = cast;
	}

	public String[] getDirectors() {
		return directors;
	}

	public void setDirectors(String[] directors) {
		this.directors = directors;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(double imdbrating) {
		this.imdbRating = imdbrating;
	}

}
