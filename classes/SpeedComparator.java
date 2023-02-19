package classes;

import java.util.Comparator;

import classes.Units.BaseUnit;

public class SpeedComparator implements Comparator<BaseUnit>{
    @Override
    public int compare(BaseUnit o1, BaseUnit o2) {
        return Integer.compare(o1.getSpeed(), o2.getSpeed());
    }
}
