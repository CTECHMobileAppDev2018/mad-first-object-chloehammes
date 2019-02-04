public class Weapons {
  
  private String weaponName;
  private int weaponDamage;
  private int weaponAmmo;
  
  //Automatically set new weapons with 35 bullets
  Weapons() {
    this.weaponAmmo = 35;
  }
  
  //Set and get the weapon name
  public void setName(String weaponName) { 

    // Making sure the name is always longer than zero
    if (weaponName.length() < 1) {
      this.name = "invalid";
      return;
    }
    
    this.name = weaponName;
  }
  
  // this just gets the name 
  public String getName() {
    return this.name;
  }
  
  //Set and get the weapon damage
  public int setDamage(int weaponDamage) {
    
    
    
