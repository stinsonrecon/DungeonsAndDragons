package Test.Monster;

import java.util.Random;

public class EvilWizard extends Monster{
    public EvilWizard(){
        Random random = new Random();
        boolean checkMelee = random.nextBoolean();
        boolean checkRange = random.nextBoolean();
        boolean checkShield = random.nextBoolean();
        int DMG = 7;
        int HP = 150;

        String[] orcName = {"Offaeh", "Dhozor", "Ohion", "Urukias", "Relore", "Rakonn", "Ekonn", "Omorith"};

        setName(orcName[random.nextInt(orcName.length)]);
        setDescription("Evil magic, cursed and hate living creatures");
        setLevel(random.nextInt(12) + 1);

        DMG += getLevel();

        MonsterWeapon orcWeapon = new MonsterWeapon(checkMelee,checkRange,checkShield);
        setWeapon(orcWeapon.toString());

        if(checkMelee){
            DMG *= 1.5;
        }
        if(checkRange){
            DMG *= 3.5;
        }
        if(checkShield){
            HP *= 2;
        }
        setDamage(DMG);
        setHp(HP + 12 * getLevel());
        setCoin(12*getLevel());
    }

    public String toString(){
        return "Evil Wizard{" +
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
