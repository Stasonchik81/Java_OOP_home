package classes.Units;
import java.util.Random;

public abstract class BaseUnit implements MainInterface, Comparable<BaseUnit>{
    protected static int number;
    protected static Random r;
    private String name;
    private int maxHp;
    protected int hp;
    protected int lucky;
    protected int protection;
    protected int maxPower;
    protected int power;
    protected int speed;
    private String team;

    static {
        BaseUnit.r = new Random();
    }

    protected BaseUnit(String name, int hp, int lucky, 
                        int protection, int maxPower, int power, int speed, String team) {
        this.name = name;
        this.maxHp = hp;
        this.hp = maxHp;
        this.lucky = lucky;
        this.protection = protection;
        this.maxPower = maxPower;
        this.power = power;
        this.speed = speed;
        this.team = team;

    }

    protected BaseUnit(String team) {
        this(String.format("Unit #%d", number),
                200,
                100,
                BaseUnit.r.nextInt(50, 100),
                BaseUnit.r.nextInt(10, 20),
                BaseUnit.r.nextInt(5, 10),
                BaseUnit.r.nextInt(5, 10),
                team);
    }

    public BaseUnit() {
            this(String.format("Unit #%d", number),
            200,
            100,
            BaseUnit.r.nextInt(50, 100),
            BaseUnit.r.nextInt(10, 20),
            BaseUnit.r.nextInt(5, 10),
            BaseUnit.r.nextInt(5, 10),
            "noTeam"
                );
    }
    public String getName(){
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }
    public String getTeam(){
        return this.team;
    }
    public int getSpeed(){
        return this.speed;
    }

    public int Attack() {
        int hit = r.nextInt(power, maxPower);
        int damage = Math.round(this.lucky * hit /100);
        return damage;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Team: %s Hp: %d Type: %s Lucky: %d Protection: %d, Power: %d, Speed: %d",
                this.name, this.team, this.hp, this.getClass().getSimpleName(),
                this.lucky, this.protection, this.power, this.speed);
    }
    
    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        damage -= (int)(this.protection*damage/100);
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
    @Override
    public void Step() {
        System.out.println(String.format("%s is step up.", this.name));
        
    }
    @Override
    public String GetInfo() {
        return String.format("I am %s", 
                            this.getClass().getSimpleName());
    }
    @Override
    public int compareTo(BaseUnit o) {
        return Integer.compare(this.hp, o.hp);
    }

}
