package Test.Monster;

import java.util.Random;

public class DarkKnight extends Monster{
    public DarkKnight(){
        Random random = new Random();
        boolean checkMelee = random.nextBoolean();
        boolean checkRange = random.nextBoolean();
        boolean checkShield = random.nextBoolean();
        int DMG = 7;
        int HP = 150;

        String[] orcName = {"Alexa", "Akasuki", "Apollyon", "Ciara", "Judith", "Naissa", "Akuja", "Melanie"};

        setName(orcName[random.nextInt(orcName.length)]);
        setDescription("Knight for the evilness,may help you for a good reason");
        setLevel(random.nextInt(10) + 1);

        DMG += getLevel();

        MonsterWeapon orcWeapon = new MonsterWeapon(checkMelee,checkRange,checkShield);
        setWeapon(orcWeapon.toString());

        if(checkMelee){
            DMG *= 3;
        }
        if(checkRange){
            DMG *= 1.5;
        }
        if(checkShield){
            HP *= 2.5;
        }
        setDamage(DMG);
        setHp(HP + 12 * getLevel());
        setCoin(10*getLevel());
    }

    public String toString(){
        return "Dark Knight{" +
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
