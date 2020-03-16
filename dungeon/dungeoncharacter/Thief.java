package dungeoncharacter;
import java.util.*;
public class Thief extends Hero {

   public Thief(final String name) {
      super(name, Stats.getThiefStats());
   }
   
   public void sneakAttack(final DungeonCharacter opponent) {
      double surprise = Math.random();
      if (surprise <= .4) {
         System.out.println("Surprise attack was successful!\n" + getName() + " gets an additional turn.");
         super.setNumTurns(super.getNumTurns() + 1);
         attack(opponent);
      }
      else if (surprise >= .9) {
         System.out.println("Uh oh! " + opponent.getName() + " saw you and blocked your attack!");
      }
   }
   
   public void attack(DungeonCharacter opponent) {
        System.out.println(super.getName() + " stabs there knife at " + opponent.getName() + ":");
        super.attack(opponent);
    }


   public void battleChoices(DungeonCharacter opponent) {
        Scanner kb = new Scanner(System.in);
        int choice;

        super.battleChoices(opponent);

        do {
            System.out.println("1. Attack Opponent");
            System.out.println("2. Attempt a sneak attack");
            System.out.print("Choose an option: ");
            choice = kb.nextInt();

            if(choice == 1) {
               this.attack(opponent);
            }
            else if (choice == 2) {
               this.sneakAttack(opponent);
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