package classes.Units;

public abstract class MentalUnit extends BaseUnit{
    protected int mana;
    protected int maxMana;

    protected MentalUnit(String name, int hp, int level, int protection, int powerHit, int mana){
        super(name, hp, level, protection, powerHit);
        this.maxMana = mana;
        this.mana = maxMana;
    }
    @Override
    public String toString() {
        return String.format("Name: %s,  Hp: %d, Type: %s, Level: %d, Protection: %d, Power: %d, MaxMana: %d",
                this.name, this.hp, this.getClass().getSimpleName(),
                this.level, this.protection, this.powerHit, this.maxMana);
    }
/**
 * 
 * @return hp 
 */
    protected abstract int treat();
}
