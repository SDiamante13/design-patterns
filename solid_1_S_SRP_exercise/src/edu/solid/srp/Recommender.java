package edu.solid.srp;

import java.util.ArrayList;
import java.util.List;

public class Recommender {

	private final CSVFormatter csvFormatter = new CSVFormatter();
	
	public String recommendationsCSV (Client client) {
		List<Movie> movieRecommendations = recommendations(client);
		return csvFormatter.formatMovies(movieRecommendations);
	}
	private List<Movie> recommendations (Client client) {
		List<Movie> recommended = new ArrayList<>();

		for (Movie favorite: client.getFavorites()) {
			recommended.addAll(BBDD.MOVIES_BY_DIRECTOR.get(favorite.getDirector()));
		}
		recommended.removeAll(client.getFavorites());

		return recommended;
	}
}
