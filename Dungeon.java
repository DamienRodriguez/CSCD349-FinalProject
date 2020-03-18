import java.util.Scanner;

public final class Dungeon {
    private Room[][] dungeon;
    private int[] pos, exitPos;
    private int size;

    public Dungeon(int dungeon_size) {
        this.size =dungeon_size;
        Room[][] dungeon = new Room[dungeon_size][dungeon_size];

        for (int row = 0; row < dungeon_size; row++) {
            for (int column = 0; column < dungeon_size; column++) {
                dungeon[row][column] = makeRoom(row, column);
            }
        }
        placePillars(dungeon);
        pos = setDungeonEntrance(dungeon);
        exitPos = setDungeonExit(dungeon);

        setDungeon(dungeon);

    }

    public int[] getExitPos() {
        return exitPos;
    }

    public int[] getPos() {
        return pos;
    }

    public void setDungeon(final Room[][] dungeon) {
        this.dungeon = dungeon;
    }

    private Room makeRoom(int x, int y) {
        int[] coords = new int[]{x, y};
        return new Room(randomBool(0.6), randomBool(0.5),randomBool(0.7),randomBool(0.3), coords);
    }

    private boolean randomBool(double d) {
        return (Math.random() < d);
    }


    private int[] setDungeonExit(Room[][] dungeon) {
        int row;
        int column;
        do {
            row = randomNum();
            column = randomNum();
            if (!(dungeon[row][column].getHasEntrance()) || !(dungeon[row][column].getHasPillar())) {
                dungeon[row][column].setHasExit(true);
                dungeon[row][column].setHasMonster(false);
                dungeon[row][column].setHasMonster(false);
                dungeon[row][column].setHasVisionPotion(false);
                dungeon[row][column].setHasHealthPotion(false);
                dungeon[row][column].setHasPillar(false);
                dungeon[row][column].setHasPit(false);
            }
        } while (!dungeon[row][column].getHasExit());
        return new int[]{row, column};
    }

    private int[] setDungeonEntrance(Room[][] dungeon) {
        int row;
        int column;
        do {
            row = randomNum();
            column = randomNum();
            if (!(dungeon[row][column].getHasPillar())) {
                dungeon[row][column].setHasEntrance(true);
                dungeon[row][column].isVisited();
                dungeon[row][column].setHasMonster(false);
                dungeon[row][column].setHasMonster(false);
                dungeon[row][column].setHasVisionPotion(false);
                dungeon[row][column].setHasHealthPotion(false);
                dungeon[row][column].setHasPillar(false);
                dungeon[row][column].setHasPit(false);
            }
        }while(!(dungeon[row][column].getHasEntrance()));

        return new int[]{row, column};
    }

    private void placePillars(Room[][] dungeon) {
        int pillars = 0;
        int row;
        int column;
        while (pillars != 4) {
            row = randomNum();
            column = randomNum();
            if (!(dungeon[row][column].getHasEntrance()) && !(dungeon[row][column].getHasPillar())&&!(dungeon[row][column].getHasPit())){
                dungeon[row][column].setHasPillar(true);
                pillars++;
            }
        }
    }

    private int randomNum() {
        double random = Math.random();
        return (int) (random * ((4) + 1));
    }

    private int randomMonsterNum() {
        double random = Math.random();
        return (int) (random * ((6) + 1));
    }

    @Override
    public String toString() {

        StringBuilder strTop = new StringBuilder();
        StringBuilder strMid = new StringBuilder();
        StringBuilder strBot = new StringBuilder();
        StringBuilder strFinal = new StringBuilder();

        for (int x = 0; x < dungeon.length; x++) {

            for (int y = 0; y < dungeon.length; y++) {
                if (dungeon[x][y].getVisited()) {
                    String[] temp = dungeon[x][y].toString().split("%");
                    strTop.append(temp[0]).append(" ");
                    strMid.append(temp[1]).append(" ");
                    strBot.append(temp[2]).append(" ");
                }
            }

            strFinal.append(strTop);
            strFinal.append("\n");

            strFinal.append(strMid);
            strFinal.append("\n");

            strFinal.append(strBot);
            strFinal.append("\n");

            strTop = new StringBuilder();
            strMid = new StringBuilder();
            strBot = new StringBuilder();

        }
        return strFinal.toString();
    }

    public void movePlayer(int i, Hero player, DungeonCharacterFactory factory) {
        int temp;

        if (i == 1 && pos[0] > 0) { //move up

            temp = pos[0];
            pos[0] = temp - 1;
            roomInteractions(player, factory);
        } else if (i == 2 && pos[0] < 4) {//move down

            temp = pos[0];
            pos[0] = temp + 1;
            roomInteractions(player, factory);
        } else if (i == 3 && pos[1] < 4) {//move right
            temp = pos[1];
            pos[1] = temp + 1;
            roomInteractions(player, factory);

        } else if (i == 4 && pos[1] > 0) {//move left
            temp = pos[1];
            pos[1] = temp - 1;
            roomInteractions(player, factory);

        } else
            System.out.println("invalid, its a wall...");
    }

    private void roomInteractions(Hero player, DungeonCharacterFactory factory) {

        this.dungeon[pos[0]][pos[1]].isVisited();

        System.out.println(pos[0] + " , " + pos[1]);

        this.dungeon[pos[0]][pos[1]].isVisited();

        if (this.dungeon[pos[0]][pos[1]].getHasPit()) {
            System.out.println("You fall into a deep pit you take 20 damage");
            player.subHP(20);

        } else if (this.dungeon[pos[0]][pos[1]].getHasMonster()) {
            System.out.println("You ran into a monster get ready for battle!");
            battle(player, factory.createMonster(randomMonsterNum()));
        }

        if (player.getCurrentHP() > 0) {
            if (this.dungeon[pos[0]][pos[1]].getHasPillar()) {
                System.out.println("You found a Piller of OO");
                player.addPillar();
                this.dungeon[pos[0]][pos[1]].setHasPillar(false);
                if (player.getFoundPillars() == 1) {
                    System.out.println("Abstraction: the pillar of hiding information.");
                } else if (player.getFoundPillars() == 2) {
                    System.out.println("Polymorphism: the pillar redefining methods.");
                } else if (player.getFoundPillars() == 3) {
                    System.out.println("Inheritance: the pillar that allows new\n" +
                            " objects to take on properties of\n" +
                            " existing objects.");
                } else if (player.getFoundPillars() == 4) {
                    System.out.println("Encapsulation: the pillar for the binding\n" +
                            " of data and functions together keeping\n" +
                            " them safe from outside interference and use.");
                    System.out.println("you found A.P.I.E.! go look for the exit!");
                }
            }
            if (this.dungeon[pos[0]][pos[1]].getHasHealthPotion()) {
                System.out.println("You found a health potion!");
                player.addHealthPotion();
                this.dungeon[pos[0]][pos[1]].setHasHealthPotion(false);
            }
            if (this.dungeon[pos[0]][pos[1]].getHasVisionPotion()) {
                System.out.println("You found a Vision potion!");
                player.addVisionPotion();
                this.dungeon[pos[0]][pos[1]].setHasVisionPotion(false);
            }
            if (player.getFoundPillars() == 4 && this.dungeon[pos[0]][pos[1]].getHasExit()) {
                System.out.println("This is the exit! You won!");
            }else if(this.dungeon[pos[0]][pos[1]].getHasExit()){
                System.out.println("This is the exit... but you have not found all the \"Pillars of OO\"");
            }
        }

    }

    public static void battle(Hero theHero, Monster theMonster) {
        Scanner kb = new Scanner(System.in);

        System.out.println(theHero.getName() + " battles " +
                theMonster.getName());
        System.out.println("---------------------------------------------");


        while (theHero.getCurrentHP() > 0 && theMonster.getCurrentHP() > 0) {
            theHero.battleChoices(theMonster);
            if (theMonster.getCurrentHP() > 0)
                theMonster.attack(theHero);

        }

        if (theMonster.getCurrentHP() <= 0)
            System.out.println(theHero.getName() + " was victorious!");
        else if (theHero.getCurrentHP() <= 0)
            System.out.println(theHero.getName() + " was defeated :-(");
        else
            System.out.println("you didn't win you didn't lose... you shouldn't have gotten here!");
    }

    public void allVisible() {
        for(int row = 0; row < this.size; row++) {
            for (int column = 0; column < this.size; column++) {
                dungeon[row][column].isVisited();
            }
        }
    }
}
