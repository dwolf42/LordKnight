package mechanics;

import java.util.Scanner;
import texts.Display;
/*
Todo
- selection must scan for player selection
- input must be validated, decimal 1-3 only
*/

public class Action {
    public static void selection() {
        Scanner scanner = new Scanner(System.in);
        Display.selection(); // 1 - attack, 2 - potion, 3 - run
        scanner.nextLine();

    }

    public static void run() {

    }

    public static void potion() {

    }

    public static void fight() {

    }
}
