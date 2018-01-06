package pl.put.poznan.transformer.logic;

import java.util.ArrayList;

public class Building implements Localization {
    private String id;
    private String name;

    private ArrayList<Level2> levelList;

    public Building(String id, String name){
        this.id = id;
        this.name = name;
        this.levelList = new ArrayList<Level2>();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public void addChild(Level2 level) {
        levelList.add(level);
    }

    @Override
    public float getArea() {
        int wart = 0;
        if (!levelList.isEmpty()){
            for (Level2 level : levelList){
                if (level instanceof Localization){
                    wart += level.getArea();
                }
            }

        }
        return wart;
    }

    @Override
    public float getCube() {
        int wart = 0;
        if (!levelList.isEmpty()){
            for (Level2 level : levelList){
                if (level instanceof Localization){
                    wart += level.getCube();
                }
            }

        }
        return wart;
    }

    @Override
    public float getHeating() {

        int wart = 0;
        if (!levelList.isEmpty()){
            for (Level2 level : levelList){
                if (level instanceof Localization){
                    wart += level.getLight();
                }
            }

        }
        return wart;
    }

    @Override
    public float getLight() {

        int wart = 0;
        if (!levelList.isEmpty()){
            for (Level2 level : levelList){
                if (level instanceof Localization){
                    wart += level.getLight();
                }
            }

        }
        return wart;
    }

}
