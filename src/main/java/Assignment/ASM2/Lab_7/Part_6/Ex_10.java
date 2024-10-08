package Assignment.ASM2.Lab_7.Part_6;

import java.util.PriorityQueue;
import java.util.TreeMap;

class Movie_Ex10 implements Comparable<Movie_Ex10> {
    String title;
    String genre;
    int releaseYear;

    public Movie_Ex10(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    @Override
    public int compareTo(Movie_Ex10 other) {
        return Integer.compare(this.releaseYear, other.releaseYear);
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", Release Year: " + releaseYear;
    }
}

public class Ex_10 {
    public static void main(String[] args) {
        TreeMap<Integer, PriorityQueue<Movie_Ex10>> movieMap = new TreeMap<>();

        PriorityQueue<Movie_Ex10> movies2020 = new PriorityQueue<>();
        movies2020.add(new Movie_Ex10("Movie A", "Action", 2020));
        movies2020.add(new Movie_Ex10("Movie B", "Drama", 2020));

        PriorityQueue<Movie_Ex10> movies2021 = new PriorityQueue<>();
        movies2021.add(new Movie_Ex10("Movie C", "Comedy", 2021));
        movies2021.add(new Movie_Ex10("Movie D", "Horror", 2021));

        movieMap.put(2020, movies2020);
        movieMap.put(2021, movies2021);

        PriorityQueue<Movie_Ex10> movies = movieMap.get(2020);
        while (!movies.isEmpty()) {
            System.out.println(movies.poll());
        }
    }
}