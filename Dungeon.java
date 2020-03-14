public class Dungeon {
    public Dungeon(int dungeon_size) {
        Room[][] dungeon = new Room[dungeon_size][dungeon_size];
        for(int row = 0; row < dungeon_size; row++) {
            for(int column = 0; column < dungeon_size; column++){
                dungeon[row][column] = Room.makeRoom();
            }
        }
    }
}
