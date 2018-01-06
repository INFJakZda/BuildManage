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

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setCube(float cube) {
        this.cube = cube;
    }

    public void setHeating(float heating) {
        this.heating = heating;
    }

    public void setLight(float light) {
        this.light = light;
    }

    public void setId(String id) {

        this.id = id;
    }

    public float getLight() {
        return light;
    }
}
