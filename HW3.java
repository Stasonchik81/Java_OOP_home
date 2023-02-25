import java.util.ArrayList;

import classes.BaseClass.BaseUnit;
import classes.BaseClass.Fortress;
import classes.BaseClass.SpeedComparator;
import classes.BaseClass.Team;
import classes.Other.*;

import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        Team <BaseUnit>first = new Team<>("Стрелки");
        Team <BaseUnit>second = new Team<>("Волшебники");
        Random r = new Random();

        for (int i = 0; i < 11; i++) {
           first.add(Fortress.createUnit(r.nextInt(1, 5), first.getName()));
        }
        for (int i = 0; i < 11; i++) {
            second.add(Fortress.createUnit(r.nextInt(5, 9), second.getName()));
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
