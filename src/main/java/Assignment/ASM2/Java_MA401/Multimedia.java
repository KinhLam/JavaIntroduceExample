package Assignment.ASM2.Java_MA401;

public abstract class Multimedia {
    String name;
    double duration;

    public Multimedia() {
    }

    public Multimedia(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public abstract void createMultimedia();

    @Override
    public abstract String toString();
}
