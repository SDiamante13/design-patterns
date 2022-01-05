package edu.solid.srp;

import java.util.List;
import java.util.stream.Collectors;

public class CSVFormatter {

    public String formatMovies(List<Movie> movies) {
        return movies.stream()
                .map(p -> (p.getTitle() + "," + p.getDirector() + "," + p.getGenre()))
                .collect(Collectors.joining("\n"));
    }
}