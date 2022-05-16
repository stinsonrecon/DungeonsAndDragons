package Test;

import java.util.Random;

public class Player {
    private String playerName;
    private int hp = 100;
    private int healthPoint;
    private int bareHandDMG = (new Random()).nextInt(10) + 1;
    private int damage;
    private boolean key, sword, bow, shield = false;
    private int coin;
    private int potion;

    public Player(String playerName){
        this.playerName = playerName;

    }

    public Player(){

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getDamage() {
        return damage;
    }

    public int getBareHandDMG() {
        return bareHandDMG;
    }

    public void setBareHandDMG(int bareHandDMG) {
        this.bareHandDMG = bareHandDMG;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public boolean isSword() {
        return this.sword;
    }

    public void setSword(boolean sword) {
        this.sword = sword;
    }

    public boolean isBow() {
        return bow;
    }

    public void setBow(boolean bow) {
        this.bow = bow;
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    public int getPotion() {
        return potion;
    }

    public void setPotion(int potion) {
        this.potion = potion;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
