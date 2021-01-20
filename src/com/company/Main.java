package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHp(777);
        boss.setDamage(50);
        boss.setDefenceType("Mag");
        System.out.println("Boss health: " + boss.getBossHp() + ";    Boss damage:  " + boss.getDamage() +
                ";   Boss defence: " + boss.getDefenceType() + ".");
        for (Hero b : createHeroes()) {
            System.out.println("Hero - damage = " + b.getDamage() + "; health = " + b.getHeroHp() +
                    "; super ability " + b.getSuperAbility() + ".");
        }
    }

    public static Hero[] createHeroes() {
        Hero lucky = new Hero(100, 25, "lucky");
        Hero valkiriya = new Hero(120, 30, "aye damage");
        Hero mag = new Hero(70, 20, "mag");
        return new Hero[]{lucky, valkiriya, mag};

    }
}
