package Assignment.ASM2.JPL_LA201;

public class Fixedwings extends Airplanes{
    String planeType;
    double minRunwaySize;

    public Fixedwings(int id, String model, double cruiseSpeed, double emptyWeight, double maxTakeOfWeight, String planeType, double minRunwaySize) {
        super(id, model, cruiseSpeed, emptyWeight, maxTakeOfWeight);
        this.planeType = planeType;
        this.minRunwaySize = minRunwaySize;
    }

    public Fixedwings(String planeType, double minRunwaySize) {
        this.planeType = planeType;
        this.minRunwaySize = minRunwaySize;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public double getMinRunwaySize() {
        return minRunwaySize;
    }

    public void setMinRunwaySize(double minRunwaySize) {
        this.minRunwaySize = minRunwaySize;
    }

    @Override
    public String flyMethod(){
        return "Fixed wing method";
    }
}
