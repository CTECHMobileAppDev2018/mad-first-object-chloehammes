
public class StartGame {
  
  public static void main(String[] args) {
   
    Player player1 = new Player();
    player1.setName("Mr. Bartucz");
    
    System.out.println("Player1 name is: " + player1.getName());
    
    Player player2 = new Player();
    import java.util.Scanner;

    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter a name: ");
    String player2 = reader.nextString(); // Scans the next token of the input as a string.
    //once finished
    reader.close();
    
    System.out.println("Player2 name is: " + player2.getName());
    
    // this won't work until you create a getHealth method in your object. Uncomment it when you do.
    // System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
    
   
    Weapon weapon1 = new Weapon();
    weapon1.setName("M4");
    weapon1.setDamage(50);
    System.out.println("Both players are fighting with " + weapon1.getName() + "'s");
   
    System.out.println(player1.getName() + "'s health is: " + player1.getHealth() + " percent");
    System.out.println(player1.getName() + "'s weapon has: " + weapon1.getAmmo() + " bullets");
    System.out.println(player1.getName() + "'s weapon does: " + weapon1.getDamage() + " damage");
  }  
  
}
