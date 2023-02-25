package classes.BaseClass.Mental;
import classes.BaseClass.Distance;

import classes.BaseClass.BaseUnit;
import classes.BaseClass.Position2D;
import classes.BaseClass.Team;
import classes.BaseClass.Mental.units.Wizard;

public abstract class MentalUnit extends BaseUnit{
    protected int mana;
    protected int maxMana;
/**
 * Духовный персонаж
 * @param name имя
 * @param maxHp максимальное здоровье
 * @param hp здоровье
 * @param level уровень
 * @param protection защита
 * @param powerHit сила удара
 * @param speed скорость
 * @param mana очки магии
 */
    protected MentalUnit(String name, int hp, int lucky, int protection, int maxPower, int power, int speed, int mana, String team, Position2D pos){
        super(name, hp, lucky, protection, maxPower, power, speed, team, pos);
        this.maxMana = mana;
        this.mana = maxMana;
    }
    @Override
    public String toString() {
        return String.format("%s\t|\t%d\t|\t%d\t|\t%d\t|\t%d\t|\t%d\t|\t(x, y): %d, %d",
            this.getName(), this.hp, this.power, this.protection, this.speed, this.mana, this.pos.getX(), this.pos.getY());
    }
    
    /**
     * Восстанавливать часть mana
     */
    public void upMana(int mana){
        this.mana = mana + this.mana > this.maxMana ? this.maxMana : mana + this.mana;
    }
    public void downMana(int mana){
        this.mana = this.mana - mana > 0 ? this.maxMana - mana : 0;
    }
    
}
