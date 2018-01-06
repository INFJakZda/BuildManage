package pl.put.poznan.transformer.logic;

public class Room {

    private String id;
    private String name;

    private float area;
    private float cube;
    private float heating;
    private float light;

    public Room(String id, String name, float area, float cube, float heating, float light) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cube = volume;
        this.heating = heatUsage;
        this.light = lightUsage;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getArea() {
        return area;
    }

    public float getCube() {
        return cube;
    }

    public float getHeating() {
        return heating;
    }

    public float getLight() {
        return light;
    }
}
