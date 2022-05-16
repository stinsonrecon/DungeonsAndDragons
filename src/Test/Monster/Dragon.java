package Test.Monster;

import Test.Item.Item;

import java.util.Random;

public class Dragon extends Monster {
    public Dragon() {
        Random random = new Random();
        int DMG = 30;
        int HP = 300;

        String[] dragonName = {"The Deathlord", "Eternal Fire", "Gedym", "The Loud", "Oirserer", "Nyghudurth", "Dragonlord", "Champion Of The Black"};

        setName(dragonName[random.nextInt(dragonName.length)]);
        setDescription("A mythical monster like a giant reptile, scream for flame and super deadly");
        setLevel(random.nextInt(2) + 1);

        DMG += getLevel();

        setDamage(DMG);
        setHp(HP + 10 * getLevel());
        setCoin(1000 * getLevel());
    }

    @Override
    public void fight() {
        super.fight();
        if(getHp() < 1){
            Item.treasure();
        }
        else {
            System.out.println("To bad, another champion lay down. Hope some day a real hero would come to save this kingdom.");
        }
        System.exit(0);

    }

    public String toString() {
        return "Dragon{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", level=" + getLevel() +
                ", hp=" + getHp() +
                ", damage=" + getDamage() +
                ", coinDrop=" + getCoin() + '}';
    }

    public void show() {
        System.out.println(
                "                                                  .~))>>\n" +
                        "                                                 .~)>>\n" +
                        "                                               .~))))>>>\n" +
                        "                                             .~))>>             ___\n" +
                        "                                           .~))>>)))>>      .-~))>>\n" +
                        "                                         .~)))))>>       .-~))>>)>\n" +
                        "                                       .~)))>>))))>>  .-~)>>)>\n" +
                        "                   )                 .~))>>))))>>  .-~)))))>>)>\n" +
                        "                ( )@@*)             //)>))))))  .-~))))>>)>\n" +
                        "              ).@(@@               //))>>))) .-~))>>)))))>>)>\n" +
                        "            (( @.@).              //))))) .-~)>>)))))>>)>\n" +
                        "          ))  )@@*.@@ )          //)>))) //))))))>>))))>>)>\n" +
                        "       ((  ((@@@.@@             |/))))) //)))))>>)))>>)>\n" +
                        "      )) @@*. )@@ )   (\\_(\\-\\b  |))>)) //)))>>)))))))>>)>\n" +
                        "    (( @@@(.@(@ .    _/`-`  ~|b |>))) //)>>)))))))>>)>\n" +
                        "     )* @@@ )@*     (@)  (@) /\\b|))) //))))))>>))))>>\n" +
                        "   (( @. )@( @ .   _/  /    /  \\b)) //))>>)))))>>>_._\n" +
                        "    )@@ (@@*)@@.  (6///6)- / ^  \\b)//))))))>>)))>>   ~~-.\n" +
                        " ( @jgs@@. @@@.*@_ VvvvvV//  ^  \\b/)>>))))>>      _.     `bb\n" +
                        " ((@@ @@@*.(@@ . - | o |' \\ (  ^   \\b)))>>        .'       b`,\n" +
                        "   ((@@).*@@ )@ )   \\^^^/  ((   ^  ~)_        \\  /           b `,\n" +
                        "     (@@. (@@ ).     `-'   (((   ^    `\\ \\ \\ \\ \\|             b  `.\n" +
                        "       (*.@*              / ((((        \\| | |  \\       .       b `.\n" +
                        "                         / / (((((  \\    \\ /  _.-~\\     Y,      b  ;\n" +
                        "                        / / / (((((( \\    \\.-~   _.`\" _.-~`,    b  ;\n" +
                        "                       /   /   `(((((()    )    (((((~      `,  b  ;\n" +
                        "                     _/  _/      `\"\"\"/   /'                  ; b   ;\n" +
                        "                 _.-~_.-~           /  /'                _.'~bb _.'\n" +
                        "               ((((~~              / /'              _.'~bb.--~\n" +
                        "                                  ((((          __.-~bb.-~\n" +
                        "                                              .'  b .~~\n" +
                        "                                              :bb ,' \n" +
                        "                                              ~~~~\n");
    }
}
