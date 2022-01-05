package edu.solid.srp;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;

public class RecommenderTest {

	Recommender recommender = new Recommender();

	@Test
	public void recommendationsCSV_returnsOnlyMoviesTheClientHasNotSeen() {
		String actualRecommendedMovies = recommender.recommendationsCSV(BBDD.JOHN);

		assertFalse(actualRecommendedMovies.contains("ET"));
	}

}
