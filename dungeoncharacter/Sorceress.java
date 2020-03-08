import java.util.*;
public class Sorceress extends Hero {

   public Sorceress(final String name) {
      super(name, Stats.getSorceressStats());
   }
   
   public void () {
        int hp;

        int MAX_ADD = 50;
        int MIN_ADD = 25;
        hp = (int) (Math.random() * (MAX_ADD - MIN_ADD + 1)) + MIN_ADD;
        addHitPoints(hPoints);
        System.out.println(getName() + " added [" + hPoints + "] points.\n"
                + "Total hit points remaining are: "
                + getHitPoints());
        System.out.println();

    }
   
   public void attack(DungeonCharacter opponent) {
        System.out.println(super.getName() + " swings a mighty sword at " + opponent.getName() + ":");
        super.attack(opponent);
    }


   public void battleChoices(DungeonCharacter opponent) {
        Scanner kb = new Scanner(System.in);
        int choice;

        super.battleChoices(opponent);

        do {
            System.out.println("1. Attack Opponent");
            System.out.println("2. Crushing Blow on Opponent");
            System.out.print("Choose an option: ");
            choice = kb.nextInt();

            if(choice == 1) {
               this.attack(opponent);
            }
            else if (choice == 2) {
               this.crushingBlow(opponent);
            }
            else {
               System.out.println("invalid choice!");
            }
            
            super.setNumTurns(super.getNumTurns() - 1);
            if (super.getNumTurns() > 0)
                System.out.println("Number of turns remaining is: " + super.getNumTurns());
        } while (super.getNumTurns() > 0);
    }
 }