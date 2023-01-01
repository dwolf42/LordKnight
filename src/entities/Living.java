// Living is the arch-type class, containing the very basic set of fields every entity must have.
// This leaves it open for entities with attributes like mana to be added later.
// Living initializes all fields with default values.
// Every entity inherits from it.

package entities;

class Living {
    private int health;
    private int attack;
    private String name;

    Living() {
        final int DEFAULT_HEALTH = 10;
        final int DEFAULT_ATTACK = 5;
        final String DEFAULT_NAME = "Dummy";

        this.health = DEFAULT_HEALTH;
        this.attack = DEFAULT_ATTACK;
        this.name = DEFAULT_NAME;
    }

    Living(int health) {
        this();
        this.health = health;
    }

    Living(int health, int attack) {
        this(health);
        this.attack = attack;
    }

    Living(int health, int attack, String name) {
        this(health, attack);
        this.name = name;
    }

    int getHealth() {
        return health;
    }

    void setHealth(int health) {
        this.health = health;
    }

    int getAttack() {
        return attack;
    }

    void setAttack(int attack) {
        this.attack = attack;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

}