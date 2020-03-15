
public final class Dungeon {
    public Room[][] Dungeon(int dungeon_size) {

        Room[][] dungeon = new Room[dungeon_size][dungeon_size];

        for(int row = 0; row < dungeon_size; row++) {
            for(int column = 0; column < dungeon_size; column++){
                dungeon[row][column] = Room.makeRoom();
            }
        }

        setDungeonEntrance(dungeon);
        setDungeonExit(dungeon);
        placePillers(dungeon);
        return dungeon;
    }

    private void setDungeonExit(Room[][] dungeon) {
        double seed;
        int res;
        do {
            seed = Math.random();
            res = (int) (seed * 10) / 20;
            if (dungeon[res][res].getHasEntrance())
                dungeon[res][res].setHasExit(true);
        }while(!dungeon[res][res].getHasExit());
    }

    private void setDungeonEntrance(Room[][] dungeon) {
        dungeon[2][2].setHasEntrance(true);
    }

    private void placePillers(Room[][] dungeon) {
        int pillers=0;

        for(int i =0;i<=3;i++)
        if(Room.getHasEntrance == false && Room.getHasPiller() ==false){
            Room.setHasPiller(true);
            pillers++;
        }
    }

    @Override
    public String toString() {
        return "";
    }
}
