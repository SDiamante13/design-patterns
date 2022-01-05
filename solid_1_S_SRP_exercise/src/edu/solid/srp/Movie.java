package edu.solid.srp;

public class Movie {

	private final String title;
	private final String director;
	private final String genre;

	public Movie(String title, String director, String genre) {
		this.title = title;
		this.director = director;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", director=" + director + "]";
	}
	
	
}
