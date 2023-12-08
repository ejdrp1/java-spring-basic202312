package dip;

public class Switch {
    private RedLight light;

    public Switch() {
        this.light = new RedLight();
    }

    public void filp() {
        if (light != null) {
            light.turnOn();
        }
    }
}
