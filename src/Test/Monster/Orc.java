package Test.Monster;

import java.util.Random;

public class Orc extends Monster{
    public Orc(){
        Random random = new Random();
        boolean checkMelee = random.nextBoolean();
        boolean checkRange = random.nextBoolean();
        boolean checkShield = random.nextBoolean();
        int DMG = 5;
        int HP = 100;

        String[] orcName = {"Igha", "Aza", "Rezar", "Nezada", "Ozaz", "Oz Ord", "Agh Uzo", "Daraza"};

        setName(orcName[random.nextInt(orcName.length)]);
        setDescription("Warlike Orc, ugly and malevolent");
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
        setHp(HP + 10 * getLevel());
        setCoin(5*getLevel());
    }

    public String toString(){
    return "Orc{" +
            "name='" + getName() + '\'' +
            ", description='" + getDescription() + '\'' +
            ", level=" + getLevel() +
            ", hp=" + getHp() +
            ", damage=" + getDamage() +
            ", weapon='" + getWeapon() + '\'' +
            '}';
    }

}
