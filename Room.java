public class Room {

    private boolean hasExit = false;
    private boolean hasEntrance = false;
    private boolean hasMonster = false;
    private boolean hasHealthpotion = false;
    private boolean hasVisionPotion = false;
    private boolean hasPiller = false;
    private boolean visited = false;
    private boolean hasPit = false;
    private int[] coordinates;

    public Room(boolean hasMonster, boolean hasHealthPotion, boolean hasVisionPotion,boolean hasPit, int[] coordinates) {
        setHasExit(false);
        setHasEntrance(false);
        boolean coin = true;
        if (coin){
            setHasMonster(hasMonster);
            coin = false;
            setHasHealthPotion(hasHealthPotion);
            setHasVisionPotion(hasVisionPotion);
        }else{
            setHasPit(hasPit);
            coin = true;
            setHasHealthPotion(false);
            setHasVisionPotion(false);
        }
        setCoordinates(coordinates);
    }

    public boolean getHasExit() {
        return hasExit;
    }

    public boolean getVisited() {
        return visited;
    }

    public void isVisited() {
        this.visited = true;
    }

    private char whatIsInRoom() {
        boolean[] arr = {getHasExit(), getHasEntrance(), getHasMonster(), getHasHealthPotion(), getHasVisionPotion(), getHasPillar()};
        int numOfTrue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i])
                numOfTrue++;
        }
        if (numOfTrue == 1) {
            if (getHasExit())
                return 'O';
            else if (getHasEntrance())
                return 'I';
            else if (getHasMonster())
                return 'X';
            else if (getHasHealthPotion())
                return 'H';
            else if (getHasVisionPotion())
                return 'V';
            else if (getHasPillar())
                return 'C';
            else if(getHasPit())
                return 'P';
        } else if (numOfTrue > 1) {
            return 'M';
        }
        return ' ';
    }

    public void setHasExit(boolean hasExit) {
        this.hasExit = hasExit;
    }

    public boolean getHasEntrance() {
        return hasEntrance;
    }

    public void setHasEntrance(boolean hasEntrance) {
        this.hasEntrance = hasEntrance;
    }

    public boolean getHasMonster() {
        return hasMonster;
    }

    public void setHasMonster(boolean hasMonster) {
        this.hasMonster = hasMonster;
    }

    public boolean getHasHealthPotion() {
        return hasHealthpotion;
    }

    public void setHasHealthPotion(boolean hasHealthpotion) {
        this.hasHealthpotion = hasHealthpotion;
    }

    public boolean getHasVisionPotion() {
        return hasVisionPotion;
    }

    public void setHasVisionPotion(boolean hasVisionPotion) {
        this.hasVisionPotion = hasVisionPotion;
    }

    public boolean getHasPillar() {
        return hasPiller;
    }

    public void setHasPillar(boolean hasPillar) {
        this.hasPiller = hasPillar;
    }

    public void setCoordinates(final int[] coordinates) {
        this.coordinates = coordinates;
    }

    public int[] getCoordinates() {
        return this.coordinates;
    }

    public boolean getHasPit() {
        return hasPit;
    }

    public void setHasPit(boolean hasPit) {
        this.hasPit = hasPit;
    }

    @Override
    public String toString() {
        isVisited(); //can only be drawn if it was visited.
        char c = whatIsInRoom();

        //Needs work when drawing out the room info.
        if (this.coordinates[1] == 0) { //left side
            if (this.coordinates[0] == 0)
                return "***%*" + c + "|%*-*"; //upper corner

            else if (this.coordinates[0] == 4) //lower corner
                return "*-*%*" + c + "|%***";

            else
                return "*-*%*" + c + "|%*-*"; //West walls
        } else if (this.coordinates[1] == 4) { //right side
            if (this.coordinates[0] == 0)
                return "***%|" + c + "*%*-*"; //upper corner
            else if (this.coordinates[0] == 4) //lower corner
                return "*-*%|" + c + "*%***";
            else
                return "*-*%|" + c + "*%*-*"; //East Wall
        } else {
            if (this.coordinates[0] == 0) //North Wall
                return "***%|" + c + "|%*-*";
            else if (this.coordinates[0] == 4) //South Wall
                return "*-*%|" + c + "|%***";
            else
                return "*-*%|" + c + "|%*-*"; //base room
        }
    }


}
