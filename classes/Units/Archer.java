package classes.Units;

public abstract class Archer extends BaseUnit{
    protected int arrows;
    protected int maxArrows;

    protected Archer(String name, int hp, int level, int protection, int powerHit, int arrows){
        super(name, hp, level, protection, powerHit);
        this.maxArrows = arrows;
        this.arrows = maxArrows;
    }

    @Override
    public String toString() {
        return String.format("Name: %s,  Hp: %d, Type: %s, Level: %d, Protection: %d, Power: %d, MaxArrows: %d",
                this.name, this.hp, this.getClass().getSimpleName(),
                this.level, this.protection, this.powerHit, this.maxArrows);
    }

    protected abstract int shoot();

}
