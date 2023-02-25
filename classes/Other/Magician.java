package classes.Other;

public class Magician extends BaseHero{
    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Magician_hero_%d", ++Magician.number), 
        Magician.r.nextInt(100, 200));
        this.maxMana = Magician.r.nextInt(50, 70);
        this.mana = maxMana;
    }

    public int Attack() {
        int damage = Magician.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }
    
}
