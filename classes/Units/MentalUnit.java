package classes.Units;

public abstract class MentalUnit extends BaseUnit{
    protected int mana;
    protected int maxMana;
/**
 * Духовный персонаж
 * @param name имя
 * @param hp здоровье
 * @param level уровень
 * @param protection защита
 * @param powerHit сила удара
 * @param mana очки магии
 */
    protected MentalUnit(String name, int hp, int level, int protection, int powerHit, int mana){
        super(name, hp, level, protection, powerHit);
        this.maxMana = mana;
        this.mana = maxMana;
    }
    @Override
    public String toString() {
        return String.format("Name: %s,  Hp: %d, Type: %s, Level: %d, Protection: %d, Power: %d, MaxMana: %d",
                this.getName(), this.getHp(), this.getClass().getSimpleName(),
                this.level, this.protection, this.powerHit, this.maxMana);
    }
/**
 * Лечить
 * @return hp 
 */
    protected abstract int treat();
}
