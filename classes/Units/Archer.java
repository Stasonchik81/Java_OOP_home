package classes.Units;

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
    protected Archer(String name, int hp, int lucky, int protection, int maxPower, int power, int speed, int arrows, String team){
        super(name, hp, lucky, protection, maxPower, power, speed, team);
        this.maxArrows = arrows;
        this.arrows = maxArrows;
    }
    /**
     * Стрелять.
     */
    protected int shoot() {
        int damage = Sniper.r.nextInt(power, maxPower);
        --this.arrows;
        if (this.arrows<=0) return 0;
        else return damage;
    }

}
