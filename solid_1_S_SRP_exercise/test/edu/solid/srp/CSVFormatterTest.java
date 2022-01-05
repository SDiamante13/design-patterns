package edu.solid.srp;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class CSVFormatterTest {

    private List<Movie> movies = asList(
            new Movie("Pretty Woman", "Garry Marshall", "Romance"),
            new Movie("Exit to Eden", "Garry Marshall", "Thriller")
    );

    @Test
    public void formatMovies_returnsCSVString() {
        CSVFormatter csvFormatter = new CSVFormatter();

        String result = csvFormatter.formatMovies(movies);

        assertEquals("Pretty Woman,Garry Marshall,Romance\nExit to Eden,Garry Marshall,Thriller", result);
    }
}