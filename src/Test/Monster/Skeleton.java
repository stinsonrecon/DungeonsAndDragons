package Test.Monster;

import java.util.Random;

public class Skeleton extends Monster{
    public Skeleton(){
        Random random = new Random();
        boolean checkMelee = random.nextBoolean();
        boolean checkRange = random.nextBoolean();
        boolean checkShield = random.nextBoolean();
        int DMG = 1;
        int HP = 20;

        String[] orcName = {"Dust", "Bane", "Nortomb", "Farrell", "Bones", "Pelvis", "Scull", "Redmourne"};

        setName(orcName[random.nextInt(orcName.length)]);
        setDescription("Undead skeleton, used to be an adventurer just like you!");
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
        setHp(HP + 2 * getLevel());
        setCoin(getLevel());
    }

    public String toString(){
        return "Skeleton{" +
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
