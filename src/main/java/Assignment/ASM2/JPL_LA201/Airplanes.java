package Assignment.ASM2.JPL_LA201;

public abstract class Airplanes {
    int id;
    String model;
    double cruiseSpeed, emptyWeight, maxTakeOfWeight;

    public Airplanes(int id, String model, double cruiseSpeed, double emptyWeight, double maxTakeOfWeight) {
        this.id = id;
        this.model = model;
        this.cruiseSpeed = cruiseSpeed;
        this.emptyWeight = emptyWeight;
        this.maxTakeOfWeight = maxTakeOfWeight;
    }

    public Airplanes(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(double cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public double getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(double emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public double getMaxTakeOfWeight() {
        return maxTakeOfWeight;
    }

    public void setMaxTakeOfWeight(double maxTakeOfWeight) {
        this.maxTakeOfWeight = maxTakeOfWeight;
    }

    public abstract String flyMethod();
}
