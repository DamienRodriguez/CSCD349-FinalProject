import java.util.Scanner;

public class DungeonAdventure {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        //Provides an introduction to the game describing what the game is about and how to play
        System.out.println("Welcome brave player, to Dungeon Adventure, in this game you will have to \n" +
                           "decend into a dungeon in search of the mighty \"Pillers of OO\". In your quest you will have to explore \n" +
                           "the dungeon room by room, but beware there are rumors of monsters and traps. Use your potions with\n" +
                           " care you never know when you will find another.\n");
        //Creates a Dungeon Object and a Hero Object (based on user choice)

        int dungeon_size =5;
        DungeonCharacterFactory factory = new DungeonCharacterFactory();
        Dungeon map = new Dungeon(dungeon_size) ;
        Hero player =  factory.createHero(characterSelect(kb),characterName(kb));
        System.out.println(player.toString());
        System.out.println(map.toString());


    }

    private static String characterName(Scanner kb) {
            System.out.println("What is your name brave adventurer?\n");
        return kb.nextLine();

    }

    private static int characterSelect(Scanner kb) {
        int choice = 0;
        System.out.println("what class do you want to play as?\n");
        while(choice == 0){
          System.out.println("1.Warrior\n" +
                             "2.Sorceress\n" +
                             "3.Thief\n->");
          choice = Integer.parseInt(kb.nextLine());
          
        }
              return choice;
    }
}
