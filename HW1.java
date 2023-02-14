import classes.Units.BaseUnit;

import java.util.ArrayList;
import java.util.Random;

import classes.Units.Arbalester;
import classes.Units.Bandit;
import classes.Units.Monk;
import classes.Units.Peasant;
import classes.Units.Sniper;
import classes.Units.Spearman;
import classes.Units.Wizard;

/**
 * HW1
 */
public class HW1 {

    public static void main(String[] args) {
        Peasant p1 = new Peasant();
        Bandit b1 = new Bandit();
        Wizard w1 = new Wizard();
        Sniper s1 = new Sniper();
        Spearman sp1 = new Spearman();
        Arbalester a1 = new Arbalester();
        Monk m1 = new Monk();
        System.out.println(p1);
        System.out.println(b1);
        System.out.println(w1);
        System.out.println(s1);
        System.out.println(sp1);
        System.out.println(a1);
        System.out.println(m1);
        m1.Step();
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