package Test.Item;

import Test.Temp;

public class Bow extends Weapon {
    public Bow() {
        setLevel(1);
        setSell(25);
        setForgeCoin(4 * getLevel());
        setBaseDMG(8 * getLevel());
        Temp.setBowDMG(getBaseDMG());
    }

    public void show() {
        System.out.println("   |\\\n" +
                "   | \\ \n" +
                "   |  \\ \n" +
                "   |   |\n" +
                ">>--------->\n" +
                "   |   |\n" +
                "   |  /\n" +
                "   | /\n" +
                "   |/\n" +
                "   ");

    }
}
