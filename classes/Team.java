package classes;

import java.util.ArrayList;

import classes.Units.BaseUnit;

public class Team {
    private String name;
    public ArrayList <BaseUnit> units;

    public String getName(){
        return this.name;
    }
    public Team(String name, ArrayList <BaseUnit> units){
        this.name = name;
        this.units = units;
    }
    public Team(String name){
        this(name, new ArrayList<BaseUnit>());
    }
    public Team(){
        this("noName");
    }
}
