public class Room {

    private boolean hasExit = false;
    private boolean hasEntrance = false;
    private boolean hasMonster = false;
    private boolean hasHealthPotion = false;
    private boolean hasVisionPotion = false;
    private boolean hasPillar = false;
    private int[] coordinates;

    public Room(final boolean hasExit, final boolean hasEntrance, final boolean hasMonster, final boolean hasHealthPotion, final boolean hasVisionPotion, final boolean hasPillar, final int[] coordinates) {
      setHasExit(hasExit);
      setHasEntrance(hasEntrance);
      setHasMonster(hasMonster);
      setHasHealthPotion(hasHealthPotion);
      setHasVisionPotion(hasVisionPotion);
      setHasPillar(hasPillar);
      setCoordinates(coordinates);
    }
    
    private char whatIsInRoom() {
      boolean[] arr = {isHasExit(), isHasEntrance(), isHasMonster(), isHasHealthPotion(), isHasVisionPotion(), isHasPillar()};
      int numOfTrue = 0;
      for(int i = 0; i < arr.length; i++) {
         if(arr[i])
            numOfTrue++;
      }
      
      if(numOfTrue == 1)
         if(isHasExit())
            return 'O';
         else if(isHasEntrance())
            return 'I';
         else if(isHasMonster())
            return 'X';
         else if(isHasHealthPotion())
            return 'H';
         else if(isHasVisionPotion())
            return 'V';
         else if(isHasPillar())
            return 'C';
      
      else if(numOfTrue > 1)
         return 'M';
      else
         return ' ';
      
      return ' ';
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

    public void setCoordinates(final int[] coordinates) {
      this.coordinates = coordinates;
    }
    
    public int[] getCoordinates() {
      return this.coordinates;
    }
    
    public boolean isHasExit() {
        return hasExit;
    }

    public void setHasExit(boolean hasExit) {
        this.hasExit = hasExit;
    }

    public boolean isHasEntrance() {
        return hasEntrance;
    }

    public void setHasEntrance(boolean hasEntrance) {
        this.hasEntrance = hasEntrance;
    }
    public boolean isHasMonster() {
        return hasMonster;
    }

    public void setHasMonster(boolean hasMonster) {
        this.hasMonster = hasMonster;
    }

    public boolean isHasHealthPotion() {
        return hasHealthPotion;
    }

    public void setHasHealthPotion(boolean hasHealthPotion) {
        this.hasHealthPotion = hasHealthPotion;
    }

    public boolean isHasVisionPotion() {
        return hasVisionPotion;
    }

    public void setHasVisionPotion(boolean hasVisionPotion) {
        this.hasVisionPotion = hasVisionPotion;
    }

    public boolean isHasPillar() {
        return hasPillar;
    }

    public void setHasPillar(boolean hasPillar) {
        this.hasPillar = hasPillar;
    }

}
