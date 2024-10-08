package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

class Song {
    String title;
    String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Artist: " + artist;
    }
}

public class Ex_37 {
    String name;
    LinkedList<Song> songList = new LinkedList<>();

    public Ex_37(String name) {
        this.name = name;
    }

    public void addSong(Song song) {
        songList.add(song);
    }

    public void removeSong(String title) {
        songList.removeIf(song -> song.title.equalsIgnoreCase(title));
    }

    public void displaySongs() {
        System.out.println("Playlist: " + name);
        for (Song song : songList) {
            System.out.println(song);
        }
    }

    public static void main(String[] args) {
        Ex_37 playlist = new Ex_37("My Favorites");
        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Blinding Lights", "The Weeknd"));

        playlist.displaySongs();

        playlist.removeSong("Shape of You");
        System.out.println("After removing 'Shape of You':");
        playlist.displaySongs();
    }
}
