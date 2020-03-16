package dungeon;
public final class Dungeon {
    private Room[][] dungeon;
    public Dungeon(int dungeon_size) {

        Room[][] dungeon = new Room[dungeon_size][dungeon_size];

        for(int row = 0; row < dungeon_size; row++) {
            for(int column = 0; column < dungeon_size; column++){
                dungeon[row][column] = makeRoom(row, column);
            }
        }

        setDungeonEntrance(dungeon);
        setDungeonExit(dungeon);
        placePillars(dungeon);
        setDungeon(dungeon);
    }
    
    public void setDungeon(final Room[][] dungeon) {
        this.dungeon = dungeon;
    }

    private Room makeRoom(int x, int y) {
        int[] coords = new int[]{x,y};
        return new Room(randomBool(),randomBool(),randomBool(), coords);
    }

    private boolean randomBool() {
        return(Math.random() < 0.5);
    }

    private void setDungeonExit(Room[][] dungeon) {
        int row=0;
        int column=0;
        do {
            row = randomNum();
            column = randomNum();
            if (dungeon[row][column].getHasEntrance())
                dungeon[row][column].setHasExit(true);
        }while(!dungeon[row][column].getHasExit());
    }

    private void setDungeonEntrance(Room[][] dungeon) {
        dungeon[2][2].setHasEntrance(true);
    }

    private void placePillars(Room[][] dungeon) {
        int pillars=1;
        int row=0;
        int column=0;
        while(pillars != 4) {
            row = randomNum();
            column = randomNum();
            if (!dungeon[row][column].getHasEntrance() && !dungeon[row][column].getHasPillar()) {
                dungeon[row][column].setHasPillar(true);
                pillars++;
            }
        }
    }

    private int randomNum(){
        double random = Math.random();
        return (int) (random * ((4) + 1));
    }
    @Override
    public String toString() {
        String str = "";
    
        for(int y = 0; y < dungeon.length - 1; y++) {
            for(int x = 0; x < dungeon.length - 1; x++) {
               if(dungeon[x][y].getVisited()) {
                  str += dungeon[x][y].toString();
               }
            }
        }
        
        return str;
    }
}
