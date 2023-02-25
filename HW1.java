import classes.BaseClass.Archer.units.Arbalester;
import classes.BaseClass.Archer.units.Sniper;
import classes.BaseClass.Mental.units.Monk;
import classes.BaseClass.Mental.units.Wizard;
import classes.BaseClass.units.Bandit;
import classes.BaseClass.units.Peasant;
import classes.BaseClass.units.Spearman;

/**
 * HW1
 */
public class HW1 {

    public static void main(String[] args) {
        String teamName = "Воины света";
        Peasant p1 = new Peasant(teamName);
        Bandit b1 = new Bandit(teamName);
        Wizard w1 = new Wizard(teamName);
        Sniper s1 = new Sniper(teamName);
        Spearman sp1 = new Spearman(teamName);
        Arbalester a1 = new Arbalester(teamName);
        Monk m1 = new Monk(teamName);
        System.out.println(p1);
        System.out.println(b1);
        System.out.println(w1);
        System.out.println(s1);
        System.out.println(sp1);
        System.out.println(a1);
        System.out.println(m1);
        m1.Step();
    }

}