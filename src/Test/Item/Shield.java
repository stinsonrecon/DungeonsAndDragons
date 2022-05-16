package Test.Item;

import Test.Temp;

public class Shield extends Weapon{
    private int BaseHP;
    public Shield(){
        setBaseDMG(0);
        setLevel(1);
        setSell(25);
        setForgeCoin(4 * getLevel());
        setBaseHP(10 * getLevel());
        Temp.setShieldHP(getBaseHP());
    }

    public void show(){
        System.out.println("  |\\\n" +
                " /|.\\\n" +
                "  |.|0\n" +
                "  |.|0\n" +
                "  |.|0\n" +
                " \\|./\n" +
                "  |/");
    }

    public int getBaseHP() {
        return BaseHP;
    }

    public void setBaseHP(int baseHP) {
        BaseHP = baseHP;
    }
}
