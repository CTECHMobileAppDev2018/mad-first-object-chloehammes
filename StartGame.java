
public class StartGame {
  
  public static void main(String[] args) {
   
    Player player1 = new Player();
    player1.setName("Mr. Bartucz");
    
    System.out.println("Player1 name is: " + player1.getName());
    
    Player player2 = new Player();
    player2.setName("Mr. Barstool");
    
    System.out.println("Player2 name is: " + player2.getName());
    
    // this won't work until you create a getHealth method in your object. Uncomment it when you do.
    // System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
  }  
  
}
