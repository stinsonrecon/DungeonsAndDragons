package Test.Monster;

import java.util.Random;

public class Goblin extends Monster{
    public Goblin(){
        Random random = new Random();
        boolean checkMelee = random.nextBoolean();
        boolean checkRange = random.nextBoolean();
        boolean checkShield = random.nextBoolean();
        int DMG = 2;
        int HP = 50;

        String[] orcName = {"Pekz", "Urd", "Slard", "Trurt", "Bafi", "Sleen", "Loxi", "Lifs"};

        setName(orcName[random.nextInt(orcName.length)]);
        setDescription("A mischievous goblin, ugly and greedy");
        setLevel(random.nextInt(10) + 1);

        DMG += getLevel();

        MonsterWeapon orcWeapon = new MonsterWeapon(checkMelee,checkRange,checkShield);
        setWeapon(orcWeapon.toString());

        if(checkMelee){
            DMG *= 2;
        }
        if(checkRange){
            DMG *= 1.5;
        }
        if(checkShield){
            HP *= 1.5;
        }
        setDamage(DMG);
        setHp(HP + 5 * getLevel());
        setCoin(2*getLevel());
    }

    public String toString(){
        return "Goblin{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", level=" + getLevel() +
                ", hp=" + getHp() +
                ", damage=" + getDamage() +
                ", coinDrop=" + getCoin() +
                ", weapon='" + getWeapon() + '\'' +
                '}';
    }
}
