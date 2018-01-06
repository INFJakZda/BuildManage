package pl.put.poznan.transformer.logic;

public class Room {

    private float length;
    private float width;
    private float height;

    public Room(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
