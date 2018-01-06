package pl.put.poznan.transformer.logic;

public class Room {

    private String id;
    private String name;

    private float area;
    private float volume;
    private float heatUsage;
    private float lightUsage;

    public Room(String id, String name, float area, float volume, float heatUsage, float lightUsage) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.volume = volume;
        this.heatUsage = heatUsage;
        this.lightUsage = lightUsage;
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

    public float getVolume() {
        return volume;
    }

    public float getHeatUsage() {
        return heatUsage;
    }

    public float getLightUsage() {
        return lightUsage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setCube(float volume) {
        this.volume = volume;
    }

    public void setHeating(float heatUsage) {
        this.heatUsage = heatUsage;
    }

    public void setLight(float lightUsage) {
        this.lightUsage = lightUsage;
    }

    public void setId(String id) {

        this.id = id;
    }
}
