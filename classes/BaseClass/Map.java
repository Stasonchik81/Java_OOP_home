package classes.BaseClass;

public class Map {
    private int length;
    private int width;
    private String name;
    
    public Map(int l, int w, String name){
        this.length = l;
        this.width = w;
        this.name = name;
    }
    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }
    public String getName(){
        return this.name;
    }
}
