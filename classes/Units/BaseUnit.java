package classes.Units;
import java.util.Random;

public abstract class BaseUnit{
    protected static int number;
    protected static Random r;
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int level;
    protected int protection;
    protected int powerHit;

    static {
        BaseUnit.r = new Random();
    }

    protected BaseUnit(String name, int hp, int level, int protection, int powerHit) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.level = level;
        this.protection = protection;
        this.powerHit = powerHit;
    }

    protected BaseUnit(String name) {
        this(name,
                BaseUnit.r.nextInt(100, 200),
                1,
                BaseUnit.r.nextInt(10, 20),
                BaseUnit.r.nextInt(5, 10)
                );
    }

    public BaseUnit() {
        this(String.format("Unit #%d", ++BaseUnit.number),
                BaseUnit.r.nextInt(100, 200),
                1,
                BaseUnit.r.nextInt(10, 20),
                BaseUnit.r.nextInt(5, 10)
                );
    }

    protected int Attack() {
         int damage = Math.round(this.level * this.powerHit * BaseUnit.r.nextInt(5, 10)/10);
         return damage;
    }

    @Override
    public String toString() {
        return String.format("Name: %s  Hp: %d Type: %s Level: %d Protection: %d, Power: %d",
                this.name, this.hp, this.getClass().getSimpleName(),
                this.level, this.protection, this.powerHit);
    }
    
    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
}
