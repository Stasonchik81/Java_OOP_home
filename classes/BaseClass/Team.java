package classes.BaseClass;

import java.util.ArrayList;

public class Team <T extends BaseUnit>{
    private String name;
    public ArrayList <T> units;
    private static int idx;
    private int number;

    static {
        idx = 0;
    }

    public Team(String name, ArrayList <T> units){
        this.name = name;
        this.units = units;
        this.number = ++Team.idx;
    }
    public Team(String name){
        this(name, new ArrayList<T>());
    }
    public Team(){
        this("noName");
    }

    public String getName(){
        return this.name;
    }
    public int getNumber(){
        return this.number;
    }
    public void add(T u){
        units.add(u);
    }

}
