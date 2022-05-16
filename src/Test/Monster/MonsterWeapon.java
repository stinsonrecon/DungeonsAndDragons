package Test.Monster;

public class MonsterWeapon {
    private boolean meleeWeapon;
    private boolean rangeWeapon;
    private boolean shield;

    public MonsterWeapon(boolean meleeWeapon, boolean rangeWeapon, boolean shield) {
        this.meleeWeapon = meleeWeapon;
        this.rangeWeapon = rangeWeapon;
        this.shield = shield;
    }

    public boolean isMeleeWeapon() {
        return meleeWeapon;
    }

    public void setMeleeWeapon(boolean meleeWeapon) {
        this.meleeWeapon = meleeWeapon;
    }

    public boolean isRangeWeapon() {
        return rangeWeapon;
    }

    public void setRangeWeapon(boolean rangeWeapon) {
        this.rangeWeapon = rangeWeapon;
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "meleeWeapon=" + meleeWeapon +
                ", rangeWeapon=" + rangeWeapon +
                ", shield=" + shield +
                '}';
    }
}
