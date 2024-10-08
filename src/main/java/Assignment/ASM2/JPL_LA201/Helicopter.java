package Assignment.ASM2.JPL_LA201;

public class Helicopter extends Airplanes{
    double range;

    public Helicopter(int id, String model, double cruiseSpeed, double emptyWeight, double maxTakeOfWeight, double range) {
        super(id, model, cruiseSpeed, emptyWeight, maxTakeOfWeight);
        this.range = range;
    }

    public Helicopter(double range) {
        this.range = range;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    @Override
    public String flyMethod(){
        return "Rotated wing method";
    }
}
