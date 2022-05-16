package Test.Item;

import Test.Player;
import Test.Temp;

import java.util.Scanner;

public class Item {
    private static Player player = new Player(Temp.getPlayerName());
    private static Scanner scanner = new Scanner(System.in);
    private static String actions;
    private static boolean running = true;

    public static void pickSword(){
        choice:
        while (running) {
            Sword sword = new Sword();
            sword.showSword();
            System.out.println("");
            System.out.println(player.getPlayerName() + " has found a sword buried in the ground, press [e] to equip or [r] to sell");
            actions = scanner.nextLine();

            if (actions.equals("e") && !player.isSword() && !player.isBow() && !player.isShield()
                    || actions.equals("e") && !player.isSword() && player.isBow() && !player.isShield()
                    || actions.equals("e") && !player.isSword() && !player.isBow() && player.isShield()) {
                player.setSword(true);
                if(player.isBow()){
                    player.setDamage(player.getBareHandDMG() + sword.getBaseDMG() + Temp.getBowDMG());
                }
                else {
                    player.setDamage(player.getBareHandDMG() + sword.getBaseDMG());
                }
                Temp.setDmg(player.getDamage());
                System.out.println("Adventurer has equip sword, now his attack increase by " + sword.getBaseDMG() + " DMG!");
                break;
            }
            else if(actions.equals("e") && player.isSword()){
                System.out.println("Your sword can be forge with " + sword.getForgeCoin() + " coin!");
                System.out.println("Do you wish to forge? Press [y] to forge");
                String check = scanner.nextLine();
                if(check.equals("y")){
                    if(player.getCoin() < sword.getForgeCoin()){
                        System.out.println("You don't have enough money!");
                        continue;
                    }
                    else {
                        sword.setLevel(sword.getLevel() + 1);
                        player.setCoin(player.getCoin() - sword.getForgeCoin());
                        Temp.setCoin(Temp.getCoin() + player.getCoin());
                        player.setDamage(player.getBareHandDMG() + sword.getBaseDMG());
                        System.out.println("Forge success!");
                        Temp.setDmg(player.getDamage());
                        System.out.println("Your DMG: " + player.getDamage());
                    }
                }
                else {
                    System.out.println("Suit yourself mate!");
                }
                break;
            }
            else if(actions.equals("r")){
                player.setCoin(player.getCoin() + sword.getSell());
                Temp.setCoin(Temp.getCoin() + player.getCoin());
                System.out.println("You earn " + sword.getSell() + " coin!");
                break;
            }
            else if (actions.equals("e") && !player.isSword() && player.isBow() && player.isShield()) {
                System.out.println("You can only own 2 weapons!");
                continue choice;
            }
            else {
                System.out.println("Sorry mate, wrong key!");
                continue choice;
            }
        }
    }

    public static void pickBow(){
        choice:
        while (running) {
            Bow bow = new Bow();
            bow.show();
            System.out.println("");
            System.out.println(player.getPlayerName() + " has found a bow hanged on the wall, press [e] to equip or [r] to sell");
            actions = scanner.nextLine();

            if (actions.equals("e") && !player.isSword() && !player.isBow() && !player.isShield()
                    || actions.equals("e") && player.isSword() && !player.isBow() && !player.isShield()
                    || actions.equals("e") && !player.isSword() && !player.isBow() && player.isShield()) {
                player.setBow(true);
                if(player.isSword()){
                    player.setDamage(player.getBareHandDMG() + bow.getBaseDMG() + Temp.getSwordDMG());
                }
                else {
                    player.setDamage(player.getBareHandDMG() + bow.getBaseDMG());
                }
                Temp.setDmg(player.getDamage());
                System.out.println("Adventurer has equip bow, now his attack increase by " + bow.getBaseDMG() + " DMG!");
                break;
            }
            else if(actions.equals("e") && player.isBow()){
                System.out.println("Your bow can be forge with " + bow.getForgeCoin() + " coin!");
                System.out.println("Do you wish to forge? Press [y] to forge");
                String check = scanner.nextLine();
                if(check.equals("y")){
                    if(player.getCoin() < bow.getForgeCoin()){
                        System.out.println("You don't have enough money!");
                        continue;
                    }
                    else {
                        bow.setLevel(bow.getLevel() + 1);
                        player.setCoin(player.getCoin() - bow.getForgeCoin());
                        Temp.setCoin(Temp.getCoin() + player.getCoin());
                        player.setDamage(player.getBareHandDMG() + bow.getBaseDMG());
                        System.out.println("Forge success!");
                        Temp.setDmg(player.getDamage());
                        System.out.println("Your DMG: " + player.getDamage());
                    }
                }
                else {
                    System.out.println("What ever!");
                }
                break;
            }
            else if(actions.equals("r")){
                player.setCoin(player.getCoin() + bow.getSell());
                Temp.setCoin(Temp.getCoin() + player.getCoin());
                System.out.println("You earn " + bow.getSell() + " coin!");
                break;
            }
            else if (actions.equals("e") && player.isSword() && !player.isBow() && player.isShield()) {
                System.out.println("You're hands are busy now!");
                continue choice;
            }
            else {
                System.out.println("Put your glasses on granny!");
                continue choice;
            }
        }
    }

    public static void pickShield(){
        choice:
        while (running) {
            Shield shield = new Shield();
            shield.show();
            System.out.println("");
            System.out.println(player.getPlayerName() + " has found a shield in the corner, press [e] to equip or [r] to sell");
            actions = scanner.nextLine();

            if (actions.equals("e") && !player.isSword() && !player.isBow() && !player.isShield()
                    || actions.equals("e") && player.isSword() && !player.isBow() && !player.isShield()
                    || actions.equals("e") && !player.isSword() && player.isBow() && !player.isShield()) {
                player.setBow(true);
                player.setHealthPoint(player.getHp() + shield.getBaseHP());
                Temp.setHp(player.getHealthPoint());
                System.out.println("Adventurer has equip shield, now his heal point increase by " + shield.getBaseHP() + "!");
                break;
            }
            else if(actions.equals("e") && player.isShield()){
                System.out.println("Your shield can be forge with " + shield.getForgeCoin() + " coin!");
                System.out.println("Do you wish to forge? Press [y] to forge");
                String check = scanner.nextLine();
                if(check.equals("y")){
                    if(player.getCoin() < shield.getForgeCoin()){
                        System.out.println("You don't have enough money!");
                        continue;
                    }
                    else {
                        shield.setLevel(shield.getLevel() + 1);
                        player.setCoin(player.getCoin() - shield.getForgeCoin());
                        Temp.setCoin(Temp.getCoin() + player.getCoin());
                        player.setHealthPoint(player.getHp() + shield.getBaseHP());
                        Temp.setHp(player.getHealthPoint());
                        System.out.println("Your HP: " + player.getHealthPoint());
                    }
                }
                else {
                    System.out.println("See you next time!");
                }
                break;
            }
            else if(actions.equals("r")){
                player.setCoin(player.getCoin() + shield.getSell());
                Temp.setCoin(Temp.getCoin() + player.getCoin());
                System.out.println("You earn " + shield.getSell() + " coin!");
                break;
            }
            else if (actions.equals("e") && player.isSword() && player.isBow() && !player.isShield()) {
                System.out.println("Don't carry to much stuff");
                continue choice;
            }
            else {
                System.out.println("You're typing the wrong key!");
                continue choice;
            }
        }
    }

    public static void itemPotion() {
        choice:
        while (running) {
            Potion potion = new Potion();
            potion.show();
            System.out.println("");
            System.out.println(player.getPlayerName() + " has found a Potion, press [e]");
            actions = scanner.nextLine();
            if (actions.equals("e")) {
                player.setPotion(player.getPotion() + 1);
                Temp.setPotionNumber(player.getPotion());
                System.out.println("Potion earned!");
                break;
            } else {
                System.out.println("You're pressing the wrong key!");
                continue choice;
            }

        }
    }

    public static void treasure() {
        System.out.println(
                "                  _.--.\n"+
                        "              _.-'_:-'||\n"+
                        "          _.-'_.-::::'||\n"+
                        "     _.-:'_.-::::::'  ||\n"+
                        "   .'`-.-:::::::'     ||\n"+
                        "  /.'`;|:::::::'      ||_\n"+
                        " ||   ||::::::'      _.;._'-._\n"+
                        " ||   ||:::::'   _.-!oo @.!-._'-.\n"+
                        " \'.  ||:::::.-!() oo @!()@.-'_.||\n"+
                        "   '.'-;|:.-'.&$@.& ()$%-'o.'\\U||\n"+
                        "     `>'-.!@%()@'@_%-'_.-o _.|'||\n"+
                        "      ||-._'-.@.-'_.-' _.-o  |'||\n"+
                        "      ||=[ '-._.-\\U/.-'    o |'||\n"+
                        "      || '-.]=|| |'|      o  |'||\n"+
                        "      ||      || |'|        _| ';\n"+
                        "      ||      || |'|    _.-'_.-'\n"+
                        "      |'-._   || |'|_.-'_.-'\n"+
                        "      '-._'-.|| |' `_.-'\n"+
                        "           '-.||_/.-'\n");
        System.out.println("You killed the dragon!");
        System.out.println("The dragon's body falls to the ground and you see a large coffin that the dragon has guarded");
        System.out.println("The coffin gives you lots of items, who knows when they will be used. Thank you for playing our game");
    }
}
