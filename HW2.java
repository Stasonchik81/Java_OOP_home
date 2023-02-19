import classes.Team;
import classes.Units.*;
import java.util.Random;


public class HW2 {
    public static void main(String[] args) {
        Team team1 = new Team("team1");
        Random r = new Random();
        String teamName = team1.getName();
        for (int i = 0; i < 11; i++) {
            switch(r.nextInt(1, 8)){
                case 1: team1.units.add(new Peasant(teamName));
                break;
                case 2: team1.units.add(new Bandit(teamName));
                break;
                case 3: team1.units.add(new Spearman(teamName));
                break;
                case 4: team1.units.add(new Sniper(teamName));
                break;
                case 5: team1.units.add(new Monk(teamName));
                break;
                case 6: team1.units.add(new Wizard(teamName));
                break;
                case 7: team1.units.add(new Arbalester(teamName));
                break;
            }
                
        }
        for (BaseUnit unit : team1.units) {
            System.out.println(unit);
        }
    
    }
    
}
