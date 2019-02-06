public class Weapon {
  
  private String weaponName;
  private int weaponDamage;
  private int weaponAmmo;
  
  public static void main(String[] args) {
  //Creates an array with a max of 5 references
    Weapon[] weaponArray = new Weapon[5];
    
   //Each weapon is created manually
    Weapon weapon0 = new Weapon();
    weapon0.setName("M4");
    
    weaponArray[0] = weapon0;
    
    //As long as i is less than 5 it will print the players from player0 to player4
    for (int i =0; i< weaponArray.length; i++) {
      if (weaponArray[i] != null) {
        System.out,println("Weapon" + i + " name is: " + weaponArray[i].getName());
        }
      }
      
   }
  
  //Automatically set new weapons with 35 bullets
  Weapon() {
    this.weaponAmmo = 35;
  }
  
  //Set and get the weapon name
  public void setName(String weaponName) { 

    // Making sure the name is always longer than zero
    if (weaponName.length() < 1) {
      this.weaponName = "invalid";
      return;
    }
    
    this.weaponName = weaponName;
  }
  
  // this just gets the name 
  public String getName() {
    return this.weaponName;
  }
  
  //Set and get the weapon damage
  public void setDamage(int weaponDamage) {
    
    this.weaponDamage = weaponDamage;
  }
      
   public int getDamage() {
     return this.weaponDamage;
   }
    
   public void setAmmo(int weaponAmmo) {
     this.weaponAmmo = weaponAmmo;
   }
     public int getAmmo() {
       return this.weaponAmmo;
     }
}
    
      
      
    
    
