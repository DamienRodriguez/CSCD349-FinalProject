import java.util.*;
public class Thief extends Hero {

   public Thief(final String name) {
      super(name, Stats.getThiefStats());
   }
   
   public void crushingBlow(final DungeonCharacter opponent) {
      int damage = 0;
      
      if(Math.random() <= .4) {
         damage =  (int) (Math.random() * 76) + 100;
         System.out.println(super.getName() + " lands a CRUSHING BLOW for " + damage + " damage!");
         opponent.subHP(damage);
         System.out.println();
      }
      else {
            System.out.println(getName() + " failed to land a crushing blow");
            System.out.println();
      }
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