package Assignment.ASM2.Java_MA401;

public class Video extends Multimedia{
    public Video(){}

    public Video(String name, double duration) {
        super(name, duration);
    }

    @Override
    public void createMultimedia(){
        System.out.println("Video created");
    }

    @Override
    public String toString(){
        return "Video: " + name + " " + duration;
    }

}
