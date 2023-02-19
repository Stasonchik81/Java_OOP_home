import java.util.ArrayList;
import classes.SpeedComparator;
import classes.Team;
import classes.Units.*;
import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        Team first = new Team("Завоеватели");
        Team second = new Team("Защитники");
        Random r = new Random();
        for (int i = 0; i < 11; i++) {
            switch(r.nextInt(1, 5)){
                case 1: first.units.add(new Peasant(first.getName()));
                break;
                case 2: first.units.add(new Bandit(first.getName()));
                break;
                case 3: first.units.add(new Sniper(first.getName()));
                break;
                case 4: first.units.add(new Wizard(first.getName()));
                break;
            }   
        }
        for (int i = 0; i < 11; i++) {
            switch(r.nextInt(1, 4)){
                case 1: second.units.add(new Peasant(second.getName()));
                break;
                case 2: second.units.add(new Spearman(second.getName()));
                break;
                case 3: second.units.add(new Monk(second.getName()));
                break;
                case 4: second.units.add(new Arbalester(second.getName()));
                break;
            }
                
        }
        ArrayList<BaseUnit> teams = new ArrayList<BaseUnit>(first.units);
        teams.addAll(second.units);
        teams.sort(new SpeedComparator());
        // teams.sort(null); /*сортировка по умолчанию по hp*/
        for (BaseUnit unit : teams) {
            System.out.println(unit);
        }
    }
}
