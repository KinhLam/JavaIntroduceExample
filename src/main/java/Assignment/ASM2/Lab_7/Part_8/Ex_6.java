package Assignment.ASM2.Lab_7.Part_8;

import java.util.Objects;
import java.util.TreeSet;

class Song_Ex6{
    String title, artist;
    double duration;

    public Song_Ex6(String title, String artist, double duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song_Ex6 songEx6 = (Song_Ex6) o;
        return Objects.equals(title, songEx6.title) && Objects.equals(artist, songEx6.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    @Override
    public String toString() {
        return "Song_Ex6{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}
public class Ex_6 {
    public static void main(String[] args) {
        TreeSet<Song_Ex6> songs = new TreeSet<>((s1, s2) -> s1.title.compareTo(s2.title));
        songs.add(new Song_Ex6("Tuy Am","Masew", 3.5));
        songs.add(new Song_Ex6("Chang Vang","Lang", 3.5));
        songs.add(new Song_Ex6("Anh dech can gi ngoai em","Den Vau", 3.5));

        System.out.println("Unique songs: " + songs);
    }
}
