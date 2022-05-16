package Test.Item;

import Test.Temp;

public class Sword extends Weapon {
    public Sword(){
        setLevel(1);
        setSell(30);
        setForgeCoin(5 * getLevel());
        setBaseDMG(10 * getLevel());
        Temp.setSwordDMG(getBaseDMG());
    }
    public void showSword() {
        System.out.println("o==[]::::::::::>");
    }

    public String toString(){
        return "Sword: " + getBaseDMG() + " baseDMG, " + getLevel() + " level, " + getSell() + " sellCoin, " + getForgeCoin() + " forgeCoin";
    }
}
