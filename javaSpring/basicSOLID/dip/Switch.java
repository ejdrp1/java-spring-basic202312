package dip;

public class Switch {
    private Light light;

    public Switch(Light light) {
        this.light = light;
    }

    public void filp() {
        if (light != null) {
            light.turnOn();
        }
    }
}
