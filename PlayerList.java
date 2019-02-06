public class PlayerList {
  public static void main(String[] args) {
  //Creates an array with a max of 5 references
    Player[] playerArray = new Player[5];
    
   //Each player is created manually
    Player player0 = new Player();
    player0.setName("Mr.Bartucz");
    
    playerArray[0] = player0;
    
    //As long as i is less than 5 it will print the players from player0 to player4
    for (int i =0; i< playerArray.length; i++) {
      if (playerArray[i] != null) {
        System.out,println("Player" + i + " name is: " + playerArray[i].getName());
        }
      }
      
   }
   
}
