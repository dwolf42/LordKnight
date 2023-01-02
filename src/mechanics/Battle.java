package mechanics;

import java.util.Random;

import entities.Monster;
import entities.Player;
import texts.Display;

public class Battle {
    public static void fight(Player player) {

        // The values are health, attack, name
        Monster monster = new Monster(5, 15, "Goblin");

        Display.encountering(player.getName(), monster.getName(),
                player.getHealth(), monster.getHealth());

        /* In the current version the player always has initiative */

        int entityHealthPreHit;

        while (player.getHealth() != 0 && monster.getHealth() != 0) {
            if (new Random().nextInt(0, Integer.MAX_VALUE) % 100 > monster.getAttack()) {
                entityHealthPreHit = player.getHealth();

                player.setHealth(player.getHealth() - (new Random().nextInt(1, monster.getAttack())));
                Display.hit(player.getName(), entityHealthPreHit, player.getHealth());
            } else {
                Display.miss(monster.getName());
            }

            if (player.getHealth() <= 0) {
                Display.deathnote(player.getName());
            }

            if (monster.getHealth() <= 0) {
                Display.deathnote(monster.getName());
            }

        }
    }
}

