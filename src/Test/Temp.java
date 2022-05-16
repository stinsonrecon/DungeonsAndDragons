package Test;

public class Temp {
    private static String playerName;
    private static int dmg;
    private static int hp;
    private static int potionNumber;
    private static int bowDMG;
    private static int swordDMG;
    private static int shieldHP;
    private static int coin;

    public static int getCoin() {
        return coin;
    }

    public static void setCoin(int coin) {
        Temp.coin = coin;
    }

    public static int getBowDMG() {
        return bowDMG;
    }

    public static void setBowDMG(int bowDMG) {
        Temp.bowDMG = bowDMG;
    }

    public static int getSwordDMG() {
        return swordDMG;
    }

    public static void setSwordDMG(int swordDMG) {
        Temp.swordDMG = swordDMG;
    }

    public static int getShieldHP() {
        return shieldHP;
    }

    public static void setShieldHP(int shieldHP) {
        Temp.shieldHP = shieldHP;
    }

    public static int getDmg() {
        return dmg;
    }

    public static void setDmg(int dmg) {
        Temp.dmg = dmg;
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int hp) {
        Temp.hp = hp;
    }

    public static int getPotionNumber() {
        return potionNumber;
    }

    public static void setPotionNumber(int potionNumber) {
        Temp.potionNumber = potionNumber;
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String playerName) {
        Temp.playerName = playerName;
    }

    public static String showStatus(){
        return Temp.getPlayerName() + ", DMG: "
                + Temp.getDmg() + ", HP: "
                + Temp.getHp() + ", Potion: " + Temp.getPotionNumber() + ", Coin: " + Temp.getCoin();
    }
}
