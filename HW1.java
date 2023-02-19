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