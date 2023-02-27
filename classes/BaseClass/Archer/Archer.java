package classes.BaseClass.Archer;

import java.util.ArrayList;

import classes.BaseClass.BaseUnit;
import classes.BaseClass.Distance;
import classes.BaseClass.Position2D;
import classes.BaseClass.Team;
import classes.BaseClass.units.Peasant;

public abstract class Archer extends BaseUnit{
    protected int arrows;
    protected int maxArrows;
    
/**
 * Лучник
 * @param name имя
 * @param maxHp максимальное здоровье
 * @param hp здоровье
 * @param lucky удача
 * @param protection защита
 * @param powerHit сила удара
 * @param arrows количество стрел
 */
    protected Archer(String name, int hp, int lucky, int protection, int maxPower, int power, int speed, int arrows, String team, Position2D p){
        super(name, hp, lucky, protection, maxPower, power, speed, team, p);
        this.maxArrows = arrows;
        this.arrows = maxArrows;
    }
    public int getArrows(){
        return this.arrows;
    }
    public void turnDownArrows(int arr){
        if (arrows>arr){
            this.arrows -= arr;
        }
        else this.arrows = 0;
    }

    public void setUpArrows(int arr){
            this.arrows += arr;
    }
    
    @Override
    public String toString() {
        return String.format("%s\t|\t%d\t|\t%d\t|\t%d\t|\t%d\t|\t%d\t|\t(x, y): %d, %d",
            this.getName(), this.hp, this.power, this.protection, this.speed, this.arrows, this.pos.getX(), this.pos.getY());
    }
    /**
     * Стрелять.
     */
    protected void shoot(BaseUnit unit, Distance range) {
        int damage = Archer.r.nextInt(power, maxPower);
        if(range == Distance.max){
            damage -=  damage/2;
        }
        else if(range == Distance.norm){
            damage -=  damage/4;
        }
        if (this.arrows>0){
            unit.GetDamage(damage);
            this.getTeam();
        }
    }
    public void step(Team<BaseUnit>a, Team<BaseUnit>b){
        if(this.state.equals(State.IsDead)||this.arrows==0)return;
        BaseUnit target = b.units.get(pos.findNearest(b));
        Distance range = pos.getRange(target.getPosition());
        shoot(target, range);
        var peasantList = new ArrayList<Peasant>();
        for (BaseUnit unit : a.units) {
            if(unit.GetInfo()=="Peasant" && unit.state == State.Alive){
                peasantList.add((Peasant)unit);
            }
        }
        if(findReady(peasantList))this.arrows++;
        else this.arrows--;

        
    }
    protected boolean findReady(ArrayList<Peasant>p){
        for (Peasant unit : p) {
            if (unit.ready){
                return true;
            }
        }
        return false;
    }

    public String stat(){
        return String.format("%s\t%d\t%d\t%d\t%s\t%s\t\t%d", 
                            this.getTeam(),
                            this.hp,
                            this.maxHp,
                            this.power,
                            this.state,
                            this.getClass().getSimpleName(),
                            this.arrows
                            );
    }

}
