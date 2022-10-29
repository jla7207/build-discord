
class Guitar {
  String sound;
  String sound2;
  String sound3;
int value =0;
  int size = 0;

public String bass(String str) { 
return "I'm a bass guitar";
}
  // 2. Overload the Bass method to include amount of int strings and String
  // sound.Return a string that matches the output of "The bass guitar has
  // [strings] strings and makes [sound]!" *** DO NOT HARD CODE THE VALUES***

  public String bass(String sound, int number) {
    return 
("The bass guitar has" + number + "strings and makes" + sound + "sound");
  }
    
 // 3. Overload the Bass method to include int strings, String sound, and int size. Return a string tht matches this output "Well my bass guitar has [strings] strings, makes [sound], and is about [size] inches!" *** DO NOT HARD CODE THE VALUES***

  public String bass(String sound, int number, int size) {
    
    return("Well my bass guitar has" + number + "strings and makes" + sound3 + "and is about" + size + "inches");

  }
  }