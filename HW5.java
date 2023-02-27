import classes.BaseClass.BaseUnit;
import classes.BaseClass.Fortress;
import classes.BaseClass.Map;
import classes.BaseClass.Names;
import classes.BaseClass.Position2D;
import classes.BaseClass.Team;

import java.util.ArrayList;
import classes.BaseClass.SpeedComparator;

import java.util.Random;
import java.util.Scanner;



public class HW5 {
    static final int UNITS = 10;
    static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
    public static void main(String[] args) {
        Random r = new Random();
        Team <BaseUnit>first = new Team<>("Light");
        Team <BaseUnit>second = new Team<>("Dark");
        Map map = new Map(10, 10, "Карта");
        Scanner user_inp = new Scanner(System.in);
        

        for (int i = 0; i < UNITS; i++) {
            Position2D position = new Position2D(0, (map.getWidth()/UNITS)*i);
            first.add(Fortress.createUnit(r.nextInt(1, 5), getName(), first.getName(), position));
         }
        for (int i = 0; i < UNITS; i++) {
            Position2D position = new Position2D(map.getLength(), (map.getWidth()/UNITS)*i);
        second.add(Fortress.createUnit(r.nextInt(5, 9), getName(), second.getName(), position));
        }
        ArrayList<BaseUnit> teams = new ArrayList<BaseUnit>(first.units);
            teams.addAll(second.units);
            teams.sort(new SpeedComparator());

        while (true) {
            user_inp.nextLine();
            for (BaseUnit unit : teams) {
                if(unit.getTeam() == first.getName()){
                    unit.step(first, second);
                }
                else unit.step(second, first);
            }
            System.out.println("Team\tHp:\tMaxHP:\tPow:\tState:\tType:\tShoot:");
            for (BaseUnit unit : teams) {
                System.out.println(unit.stat());
            } 
        }    
        
        
   }
}
