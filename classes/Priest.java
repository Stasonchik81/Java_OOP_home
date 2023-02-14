package classes;

public class Priest extends BaseHero{
    private static final String HERO_PRIEST_D = "Hero_Priest #%d";
    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format(HERO_PRIEST_D, ++BaseHero.number), 
        BaseHero.r.nextInt(100, 200));
        this.maxElixir = BaseHero.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    public int Attack() {
        int damage = Priest.r.nextInt(20, 30);
        this.elixir -= (int)(damage * 0.8);
        if (elixir < 0) return 0;
        else return damage;
    }

}
