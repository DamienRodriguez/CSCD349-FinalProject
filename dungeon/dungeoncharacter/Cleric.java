package dungeon.dungeoncharacter;


import java.util.Scanner;

public class Cleric extends Hero {

    public Cleric(final String name) {
        super(name, Stats.getSorceressStats());
    }

    public void heal() {
        int hp;
        int[] healVariance = super.getStats().getHealVariance();

        hp = (int) (Math.random() * (healVariance[1] - healVariance[0] + 1)) + healVariance[0];
        super.addHP(hp);
        System.out.println(super.getName() + " added [" + hp + "] points.\n" + "Total hit points remaining are: " + super.getStats().getHP());
        System.out.println();
    }

    public void attack(DungeonCharacter opponent) {
        if (opponent == null)
            throw new IllegalArgumentException("Opponent parmesan was passed as null.");

        System.out.println(super.getName() + " brings a mace down to smite " + opponent.getName() + ":");
        super.attack(opponent);
    }

    public void battleChoices(DungeonCharacter opponent) {
        if (opponent == null)
            throw new IllegalArgumentException("Opponent parmesan was passed as null.");

        Scanner kb = new Scanner(System.in);
        int choice;

        super.battleChoices(opponent);

        do {
            System.out.println("1. Attack Opponent");
            System.out.println("2. Cast Heal");
            System.out.print("Choose an option: ");
            choice = kb.nextInt();

            if (choice == 1) {
                this.attack(opponent);
            } else if (choice == 2) {
                this.heal();
            } else {
                System.out.println("invalid choice!");
            }

            super.setNumTurns(super.getNumTurns() - 1);
            if (super.getNumTurns() > 0)
                System.out.println("Number of turns remaining is: " + super.getNumTurns());
        } while (super.getNumTurns() > 0);

    }
}