package classes.BaseClass;


import classes.BaseClass.Archer.Archer;
import classes.BaseClass.BaseUnit.State;
import classes.BaseClass.Mental.MentalUnit;


public class Position2D {
    protected int x, y;
    
    public Distance dist;

    public Position2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x){
        this.x  = x;
    }
    public void setY(int y){
        this.y  = y;
    }
    protected Double getDistance(Position2D pos){
        return Math.sqrt(Math.pow(pos.x-x, 2)+Math.pow(pos.y-y, 2));
    }
    public Distance getRange(Position2D pos){
        int mapSize = settings.MAPSIZE;
        Double dist = getDistance(pos);
        if(dist<mapSize/3)return Distance.min;
        else if(dist>mapSize - mapSize/3)return Distance.max;
        else return Distance.norm;
    }

    public int findNearest(Team<BaseUnit> team){
        int idx = 0;
        double minDistance = 100;
        for (int i = 0; i < team.units.size(); i++) {
            BaseUnit unit = team.units.get(i);
            if (getDistance(unit.getPosition())<minDistance &&
                unit.state==State.Alive){
                minDistance = getDistance(unit.getPosition());
                idx = i;
            }
        }
        return idx;
    }
    
    public int findNearestArcher(Team<BaseUnit> team){
        int idx = 0;
        double minDistance = 100;
        for (int i = 0; i < team.units.size(); i++) {
            BaseUnit unit = team.units.get(i);
            if(unit instanceof Archer){
                if (getDistance(unit.getPosition())<minDistance &&
                    unit.hp>0){
                    minDistance = getDistance(unit.getPosition());
                    idx = i;
                }
            }
        }
        return idx;
    }
    public int findNearestMental(Team<BaseUnit> team){
        int idx = 0;
        double minDistance = 100;
        for (int i = 0; i < team.units.size(); i++) {
            BaseUnit unit = team.units.get(i);
            if(unit instanceof MentalUnit){
                if (getDistance(unit.getPosition())<minDistance &&
                    unit.hp>0){
                    minDistance = getDistance(unit.getPosition());
                    idx = i;
                }
            }
        }
        return idx;
    }
}
