public class Weapon {
  
  private String weaponName;
  private int weaponDamage;
  private int weaponAmmo;
  
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
    
      
      
    
    
