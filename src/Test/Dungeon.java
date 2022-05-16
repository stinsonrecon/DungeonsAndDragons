package Test;

import Test.Monster.Dragon;

import java.util.Random;
import java.util.Scanner;

public class Dungeon extends Player {
    private static boolean input = true;
    static Scanner scanner = new Scanner(System.in);

    public void startGame() {
        AudioPlayer player = new AudioPlayer();
        player.start();

        Temp.setDmg((new Random()).nextInt(10) + 1);
        Temp.setHp(100);
        Temp.setCoin(0);

        System.out.println("Welcome to Dragon Treasure, what should we call you adventurer?");
        System.out.print("Enter your name here: ");
        setPlayerName(scanner.nextLine());
        Temp.setPlayerName(getPlayerName());
        System.out.println("Get ready " + getPlayerName() + "! For a scarier adventure!");
        System.out.println( "You are standing outside a cave. There is a smell of sulfur coming from the opening");
        System.out.println("The cave opening is to your east. Write \"e\" and press [Enter] to enter the cave");
        while (input){
            String actions = scanner.nextLine();
            if(actions.equals("e")){
                input = false;
            }
            else {
                System.out.println("Press \"e\" to enter the cave!");
            }
        }
        Room generateRoom = new Room();
        generateRoom.generateDungen();
        optionInput(generateRoom);
    }

    public static void optionInput(Room dungeon){
        while (true){
            System.out.println("You can now choose four directions, where do you want to go?");
            System.out.println("e, w, n, s");
            System.out.println("Or press [i] to show status");
            System.out.println("You done exploring and its time to slay some dragon [b]");
            String option = scanner.nextLine();
            if(option.equals("i")){
                System.out.println(Temp.showStatus());
            }
            else if(option.equals("b")){
                Dragon dragon = new Dragon();
                System.out.println("A DRAGON!!!!!!!!");
                System.out.println(dragon.toString());
                dragon.show();
                dragon.fight();
            }
            else {
                dungeon.roomChanging(option);
            }
        }
    }
}
