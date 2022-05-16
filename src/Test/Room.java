package Test;



import Test.Item.Item;
import Test.Monster.*;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Random;

public class Room {
    private String description;
    private int column;
    private int row;
    private int monsterNumber;
    private int treasureNumber;
    private int weaponNumber;
    private Room currentRoom;
    private Room[][] tempRoom;
    private int x,y;

    private final Random random = new Random();

    public Room(){

    }

    public Room(String description, int monsterNumber, int treasureNumber, int weaponNumber) {
        this.description = description;
        this.monsterNumber = monsterNumber;
        this.treasureNumber = treasureNumber;
        this.weaponNumber = weaponNumber;
    }

    public Room[][] generateRoom(){
        int value;
        while (true){
            value= random.nextInt(12) + 1; // Toi da se co 12 phong
            if(value > 1){
                column = value/2;
                row = value - column;
                Room[][] rooms = new Room[column][row];
                System.out.println("Dungen has create with: " + (column + row) + " room(s)");
                return rooms;
            }
        }
    }

    public Room[][] generateDungen(){
        Room starterRoom = new Room();
        starterRoom.setDescription("You are in a dark part of the cave," +
                " there is a bright spot further ahead that catches your interest");

        Room[][] dungen = generateRoom();
        tempRoom = dungen;
        dungen[0][0] = starterRoom;
        for(int i = 1; i < column; i++){
            for(int j = 0; j < row; j++){
                monsterNumber = random.nextInt(column * 10) + 1;
                treasureNumber = random.nextInt(5) + 1;
                weaponNumber = random.nextInt(5) + 1;
                Room room = new Room(i + "-" + j,
                        monsterNumber,
                        treasureNumber,
                        weaponNumber);

                dungen[i][j] = room;
            }
        }
        System.out.println(dungen[0][0].description);
        currentRoom = dungen[0][0];
        return dungen;
    }

    public void getCurrentRoomPos(){
        for (int i = 0 ; i < column; i++) {
            for (int j = 0; j < row; j++) {
                if (tempRoom[i][j] == currentRoom) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.println("You are at room " + x + "-" + y);
        int dropRate = random.nextInt(6) + 1;
        int spamRate = random.nextInt(6) + 1;
        switch (dropRate){
            case 1:
                Item.pickSword();
                break;
            case 2:
                Item.pickBow();
                break;
            case 3:
                Item.pickShield();
                break;
            case 4:
                Item.itemPotion();
                break;
            default:
                break;
        }
        switch (spamRate){
            case 1:
                Skeleton skeleton = new Skeleton();
                System.out.println("A skeleton!!!!");
                System.out.println(Temp.showStatus());
                System.out.println(skeleton.toString());
                skeleton.fight();
                break;
            case 2:
                Goblin goblin = new Goblin();
                System.out.println("A goblin!!!!");
                System.out.println(Temp.showStatus());
                System.out.println(goblin.toString());
                goblin.fight();
                break;
            case 3:
                Orc orc = new Orc();
                System.out.println("An orc!!!");
                System.out.println(Temp.showStatus());
                System.out.println(orc.toString());
                orc.fight();
                break;
            case 4:
                DarkKnight darkKnight = new DarkKnight();
                System.out.println("Dark knight!!!!");
                System.out.println(Temp.showStatus());
                System.out.println(darkKnight.toString());
                darkKnight.fight();
                break;
            case 5:
                EvilWizard evilWizard = new EvilWizard();
                System.out.println("Evil Wizard!!!!");
                System.out.println(Temp.showStatus());
                System.out.println(evilWizard.toString());
                evilWizard.fight();
                break;
            default:
                break;
        }
    }

    public void roomChanging(String actions){
        switch (actions){
            case "e":
                if(y < row){
                    y += 1;
                    currentRoom = tempRoom[x][y];
                    getCurrentRoomPos();
                }
                else {
                    System.out.println("There is no way to go!");
                }
                break;
            case "w":
                if(y > 0){
                    y -= 1;
                    currentRoom = tempRoom[x][y];
                    getCurrentRoomPos();
                }
                else {
                    System.out.println("There is no way to go!");
                }
                break;
            case "n":
                if(x > 0){
                    x -= 1;
                    currentRoom = tempRoom[x][y];
                    getCurrentRoomPos();
                }
                else {
                    System.out.println("There is no way to go!");
                }
                break;
            case "s":
                if(x < column){
                    x += 1;
                    currentRoom = tempRoom[x][y];
                    getCurrentRoomPos();
                }
                else {
                    System.out.println("There is no way to go!");
                }
                break;
            default:
                System.out.println("Please follow the order!");
                break;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMonsterNumber() {
        return monsterNumber;
    }

    public void setMonsterNumber(int monsterNumber) {
        this.monsterNumber = monsterNumber;
    }

    public int getTreasureNumber() {
        return treasureNumber;
    }

    public void setTreasureNumber(int treasureNumber) {
        this.treasureNumber = treasureNumber;
    }

    public int getWeaponNumber() {
        return weaponNumber;
    }

    public void setWeaponNumber(int weaponNumber) {
        this.weaponNumber = weaponNumber;
    }

    @Override
    public String toString() {
        return "Dungen{" +
                "description='" + description + '\'' +
                ", monsterNumber=" + monsterNumber +
                ", treasureNumber=" + treasureNumber +
                ", weaponNumber=" + weaponNumber +
                '}';
    }
}
