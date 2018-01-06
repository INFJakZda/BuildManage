package pl.put.poznan.transformer.logic;

import java.util.ArrayList;

public class Building {
    private String id;
    private String name;
    private ArrayList<Level2> levelList;


    public Building(String id, String name)
    {
        this.setId(id);
        this.setName(name);
        this.levelList = new ArrayList<Level2>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
