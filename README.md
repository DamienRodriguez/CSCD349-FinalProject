# CSCD349-FinalProject


I've been looking at the design of DungeonCharacter, and think that we can do things a little differently to make things smoother to implment after respective interfaces are created.

What I would like to do:
  - Create an action interface to replace attack, which could include some form of special attack method that could be overriden in respective child classes
  - Change the primitive obession within the DungeonCharacter Heirarchy to accept a data class object to make things smoother
  - Change simple factory into an abstract factory for better modularity
