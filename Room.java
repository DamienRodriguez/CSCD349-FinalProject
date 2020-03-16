public class Room{

    private boolean hasExit = false;
    private boolean hasEntrance = false;
    private boolean hasMonster = false;
    private boolean hasHealthpotion = false;
    private boolean hasVisionPotion = false;
    private boolean hasPiller = false;
    private int[] coordinates;

    public Room(boolean hasMonster,boolean hasHealthPotion , boolean hasVisionPotion, int[] coordinates){
        setHasExit(false);
        setHasEntrance(false);
        setHasMonster(hasMonster);
        setHasHealthPotion(hasHealthPotion);
        setHasVisionPotion(hasVisionPotion);
        setHasPillar(false);
        setCoordinates(coordinates);
    }

    public boolean getHasExit() {
        return hasExit;
    }
    private char whatIsInRoom() {
        boolean[] arr = {getHasExit(), getHasEntrance(), getHasMonster(), getHasHealthPotion(), getHasVisionPotion(), getHasPillar()};
        int numOfTrue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i])
                numOfTrue++;
        }
        if (numOfTrue == 1){
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
        }else if(numOfTrue > 1) {
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

    @Override
    public String toString() {
        char c = whatIsInRoom();

        //Needs work when drawing out the room info.
        if(this.coordinates[1] == 0) { //left side
            if(this.coordinates[0] == 0)
                return "* * *\n* "+c+" |\n* - *"; //upper corner
            else if(this.coordinates[0] == 4) //lower corner
                return "* - *\n* "+c+" |\n* * *";
            else
                return "* - *\n* "+c+" |\n* - *"; //West walls
        }

        else if(this.coordinates[1] == 4) { //right side
            if(this.coordinates[0] == 0)
                return "* * *\n| "+c+" * \n* - *"; //upper corner
            else if(this.coordinates[0] == 4) //lower corner
                return "* - *\n| "+c+" *\n* * *";
            else
                return "* - *\n| "+c+" *\n* - *"; //East Wall
        }

        else {
            if(this.coordinates[0] == 0) //North Wall
                return " * *\n"+c+" |\n - *";
            else if(this.coordinates[0] == 4) //South Wall
                return " - *\n"+c+" |\n * *";
            else
                return " -  \n "+c+" \n  - ";
        }
    }
}
