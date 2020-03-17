import java.util.*;
public class Alchemist extends Hero {

    public Alchemist(final String name) {
        super(name, Stats.getAlchemistStats());
    }

    public void createHealthPotion() {

        System.out.println(super.getName() + " attempts to create a health potion!.");
        if(Math.random() < .4) {
            super.addHealthPotion();
            System.out.println("Success!");
        }
        else {
            System.out.println("Back to the mortal and pestle kid. Failure!");
        }
    }

    public void createVisionPotion() {

        System.out.println(super.getName() + " attempts to create a vision potion!.");
        if(Math.random() < .05) {
            super.addVisionPotion();
            System.out.println("Success!");
        }
        else {
            System.out.println("Back to the mortal and pestle kid. Failure!");
        }
    }

    public void attack(DungeonCharacter opponent) {
        if(opponent == null)
            throw new IllegalArgumentExeception("Opponent parmesan was passed as null.");
         
        System.out.println(super.getName() + " throws a flask of fire at " + opponent.getName() + ":");
        super.attack(opponent);
    }

    public void battleChoices(DungeonCharacter opponent) {
        if(opponent == null)
            throw new IllegalArgumentExeception("Opponent parmesan was passed as null.");
        
        Scanner kb = new Scanner(System.in);
        int choice;

        super.battleChoices(opponent);

        do {
            System.out.println("1. Attack Opponent");
            System.out.println("2. Create a Health Potion");
            System.out.println("3. Create a Vision Potion");
            System.out.print("Choose an option: ");
            choice = kb.nextInt();

            if(choice == 1) {
                this.attack(opponent);
            }
            else if (choice == 2) {
                this.createHealthPotion();
            }

            else if (choice == 3) {
                this.createVisionPotion();
            }

            else {
                System.out.println("invalid choice!");
            }

            super.setNumTurns(super.getNumTurns() - 1);
            if (super.getNumTurns() > 0)
                System.out.println("Number of turns remaining is: " + super.getNumTurns());
        } while (super.getNumTurns() > 0);
        kb.close();
    }
}