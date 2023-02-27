package classes.BaseClass;
import java.util.Random;
/**
 * Базовый юнит
 * @param maxHp максимум здоровья
 */
public abstract class BaseUnit implements MainInterface, Comparable<BaseUnit>{
    protected static int number;
    protected static Random r;
    private String name;
    protected int maxHp;
    protected int hp;
    protected int lucky;
    protected int protection;
    protected int maxPower;
    protected int power;
    protected int speed;
    private String team;
    protected Position2D pos;
    protected enum State{
        Alive, IsDead
    }
    public State state; 

    static {
        BaseUnit.r = new Random();
    }
    /**
     * 
     * @param name имя
     * @param hp текущий уровень здоровья
     * @param lucky удача
     * @param protection защита
     * @param maxPower максимальная сила удара
     * @param power текущая сила удара
     * @param speed скорость
     * @param team команда
     */
    protected BaseUnit(String name, int hp, int lucky, 
                        int protection, int maxPower, int power, int speed, String team, Position2D p, State state) {
        this.name = name;
        this.maxHp = hp;
        this.hp = maxHp;
        this.lucky = lucky;
        this.protection = protection;
        this.maxPower = maxPower;
        this.power = power;
        this.speed = speed;
        this.team = team;
        this.pos = p;
        this.state = state;
                        
    }

    protected BaseUnit(String name, int hp, int lucky, int protection, 
                        int maxPower, int power, int speed, String team, Position2D p) {
        this(name, hp, lucky, protection, maxPower, power, speed, team, p, State.Alive);
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
    public boolean getDamaged(){
        return this.hp != this.maxHp;
    }
    public Position2D getPosition(){
        return this.pos;
    }
    public void setPosition(Position2D newPos){
        this.pos = newPos;
    }
    /**
     * Атака ({@link lucky} повышает урон)
     * @return урон
     */
    protected void Attack(BaseUnit unit) {
        int hit = r.nextInt(power, maxPower);
        int damage = Math.round(this.lucky * hit /100);
        unit.GetDamage(damage);
    }

    @Override
    public String toString() {
        return String.format("%s\t|\t%d\t|\t%d\t|\t%d\t|\t%d\t|\t \t|\t(x, y): %d, %d",
            this.name, this.hp, this.power, this.protection, this.speed, this.pos.x, this.pos.y);
    }
    /**
     * Лечиться
     * @param Hp величина восстанавливаемого здоровья
     */
    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }
    /**
     * Повышать защиту
     * @param points величина повышения защиты (максимум = 80)
     */
    public void upProtection(int points) {
        this.protection = points + this.protection > 80 ? 80 : points + this.protection;
    }
    /**
     * Получение урона ({@link protection} снижает урон)
     * @param damage урон
     */
    public void GetDamage(int damage) {
        damage -= (int)(this.protection*damage/100);
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        else { 
            this.hp = 0;
            this.state = State.IsDead; 
        }
    }
    public String stat(){
        return String.format("%s\t%d\t%d\t%d\t%s\t%s", 
                            this.team,
                            this.hp,
                            this.maxHp,
                            this.power,
                            this.state,
                            this.getClass().getSimpleName()
                            );
    }
        
    

    @Override
    public String GetInfo() {
        return String.format("%s", 
                            this.getClass().getSimpleName());
    }

    @Override
    public int compareTo(BaseUnit o) {
        return Integer.compare(this.hp, o.hp);
    }

}
