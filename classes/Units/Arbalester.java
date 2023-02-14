package classes.Units;

public class Arbalester extends Archer {
    static{
        Arbalester.number = 0;
    }
    /**
     * Арбалетчик. Атакует как на расстоянии так и в ближнем бою.
     */
    public Arbalester(){
        super(String.format("Arbalester #%d", ++Arbalester.number),
        Arbalester.r.nextInt(70, 120), 
        1, 
        Sniper.r.nextInt(12, 22), 
        Sniper.r.nextInt(5, 12),
        Sniper.r.nextInt(5, 10));
    }
    /**
     * Стрелять.
     */
    @Override
    protected int shoot() {
        int damage = Arbalester.r.nextInt(15, 25);
        --this.arrows;
        if (this.arrows<=0) return 0;
        else return damage;
    }
}
