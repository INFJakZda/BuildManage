package pl.put.poznan.transformer.logic;

import java.util.ArrayList;

public class Level2 implements Localization {

    private String id;
    private String name;

    private ArrayList<Room> roomList;

    public Level2(String id, String name){
        this.id = id;
        this.name = name;
        this.roomList = new ArrayList<Room>();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public void addChild(Room room) {
        roomList.add(room);
    }

    @Override
    public float getArea() {
        int wart = 0;
        if (!roomList.isEmpty()){
            for (Room room : roomList){
                if (room instanceof Localization){
                    wart += room.getArea();
                }
            }

        }
        return wart;
    }

    @Override
    public float getCube() {

        int wart = 0;
        if (!roomList.isEmpty()){
            for (Room room : roomList){
                if (room instanceof Localization){
                    wart += room.getCube();
                }
            }
        }
        return wart;
    }

    @Override
    public float getHeating() {

        int wart = 0;
        if (!roomList.isEmpty()){
            for (Room room : roomList){
                if (room instanceof Localization){
                    wart += room.getHeating();
                }
            }
        }
        return wart;
    }

    @Override
    public float getLight() {

        int wart = 0;
        if (!roomList.isEmpty()){
            for (Room room : roomList){
                if (room instanceof Localization){
                    wart += room.getLight();
                }
            }
        }
        return wart;
    }
}
