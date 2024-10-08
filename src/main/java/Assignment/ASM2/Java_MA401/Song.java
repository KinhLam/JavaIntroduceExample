package Assignment.ASM2.Java_MA401;

public class Song extends Multimedia{
    String singer;

    public Song(){}

    public Song(String singer) {
        this.singer = singer;
    }

    public Song(String name, double duration, String singer) {
        super(name, duration);
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public void createMultimedia(){
        System.out.println("Song created");
    }

    @Override
    public String toString(){
        return "Song: " + name + " " + duration + " " + singer;
    }
}
