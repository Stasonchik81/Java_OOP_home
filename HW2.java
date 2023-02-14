import classes.Units.*;
import java.util.ArrayList;
import java.util.Random;


public class HW2 {
    public static void main(String[] args) {
        ArrayList <BaseUnit> team1 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 11; i++) {
            switch(r.nextInt(1, 8)){
                case 1: team1.add(new Peasant());
                break;
                case 2: team1.add(new Bandit());
                break;
                case 3: team1.add(new Spearman());
                break;
                case 4: team1.add(new Sniper());
                break;
                case 5: team1.add(new Monk());
                break;
                case 6: team1.add(new Wizard());
                break;
                case 7: team1.add(new Arbalester());
                break;
            }
                
        }
        for (BaseUnit unit : team1) {
            System.out.println(unit.GetInfo());
        }
    }
}
