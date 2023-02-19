package classes.Units;

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
    protected MentalUnit(String name, int hp, int lucky, int protection, int maxPower, int power, int speed, int mana, String team){
        super(name, hp, lucky, protection, maxPower, power, speed, team);
        this.maxMana = mana;
        this.mana = maxMana;
    }
    /**
     * Лечить (восстанавливает часть hp)
     * @return +hp
     */
    protected int treat(){
        int hp = Wizard.r.nextInt(5, 10);
        this.mana -= (int)(hp * 0.5);
        if(mana<0)return 0;
        else return hp;
    }
}
