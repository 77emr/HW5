package com.company;

public class Hero {
    private int heroHp;
    private int damage;
    private String superAbility;

    public Hero(int heroHp, int damage, String superAbility) {
        this.heroHp = heroHp;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public Hero(int heroHp, int damage) {
        this.heroHp = heroHp;
        this.damage = damage;
    }

    public int getHeroHp() {
        return heroHp;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
