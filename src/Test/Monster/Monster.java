package Test.Monster;

import Test.Temp;

import java.util.Scanner;

public class Monster {
    private String name;
    private String description;
    private int level;
    private int hp;
    private int damage;
    private int coin;
    private String weapon;

    public void fight() {
        Scanner scanner = new Scanner(System.in);
        String action;
        do {
            System.out.println("Make a move:");
            System.out.println("[a] Attack     [s] Drink potion     [d] Flee");
            action = scanner.nextLine();
            if (action.equals("a")) {
                hp = hp - Temp.getDmg();
                System.out.println("You did: " + Temp.getDmg() + " damage");
                System.out.println("Enemy: " + hp + " HP left!");
            }
            if (action.equals("s")) {
                if (Temp.getPotionNumber() > 0) {
                    Temp.setPotionNumber(Temp.getPotionNumber() - 1);
                    Temp.setHp(Temp.getHp() + 60);
                    System.out.println("The drink heal you 60HP, now you have: " + Temp.getHp() + "HP!");
                } else
                    System.out.println("You have run out of health drinks!");
            }
            if (action.equals("d")) {
                Temp.setHp(Temp.getHp() - 3);
                System.out.println("You disengage but still take 3dmg from the enemy!");
                System.out.println("Your HP: " + Temp.getHp());
                break;
            }
            if (hp > 0) {
                Temp.setHp(Temp.getHp() - damage);
                System.out.println("Enemy did: " + damage
                        + " injury to you!\n" + "You have: "
                        + Temp.getHp() + " HP left!\n");
            }

            if (Temp.getHp() <= 0) {
                System.out.println("You're dead! Try again");
                System.exit(0);
            }
        }
        while (hp >= 1);
        if(hp < 1){
            System.out.println("Enemy drop: " + coin + " coin!");
            Temp.setCoin(Temp.getCoin() + coin);
        }
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


}
