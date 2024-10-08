package Assignment.ASM2.Lab_7.Part_2;

import java.util.HashSet;
import java.util.Objects;

class Song_Ex5{
    String title;
    String artist;
    double duration;

    public Song_Ex5(String title, String artist, double duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song_Ex5 song = (Song_Ex5) o;
        return title.equals(song.title) && artist.equals(song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    @Override
    public String toString() {
        return "Song_Ex5{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}
public class Ex_5 {
    public static void main(String[] args) {
        HashSet<Song_Ex5> songs = new HashSet<>();
        songs.add(new Song_Ex5("Túy Âm", "Xesi x Masew x Nhatnguyen", 3.22));
        songs.add(new Song_Ex5("Chạng Vạng", "Lãng", 3.16));
        songs.add(new Song_Ex5("Túy Âm", "Xesi x Masew x Nhatnguyen", 3.22));

        System.out.println("Unique songs:");
        songs.forEach(System.out::println);
    }
}
