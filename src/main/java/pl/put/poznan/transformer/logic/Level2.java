package pl.put.poznan.transformer.logic;

import java.util.ArrayList;

public class Level2 {
    private int floor;
    private ArrayList<Room> roomList;

    public Level2(int floor){
        this.floor = floor;
        this.roomList = new ArrayList<Room>();
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }
}
