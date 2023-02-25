package classes.BaseClass;

import java.util.Comparator;

public class SpeedComparator implements Comparator<BaseUnit>{
    @Override
    public int compare(BaseUnit o1, BaseUnit o2) {
        return Integer.compare(o2.getSpeed(), o1.getSpeed());
    }
}
