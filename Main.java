/*Lab 4
Partners Grant Rimstidt and Sam Hunkler
9/16/2020
*/
import java.util.*;
class Main {

  public static void main(String[] args) {
    Random r =new Random();
    int randomNum = r.nextInt(51);
    System.out.println("The random number is " + randomNum);
    countDown(randomNum);
    if (randomNum < 25)
    System.out.println("Ahoy Matey!");
    if (42>randomNum && randomNum >25)
    System.out.println("Cannonball!");
    if (randomNum > 42)
    System.out.println("Blastoff!");
  }



static int countDown(int rand) {
  if (rand > 1)
    do {
    rand--;
   System.out.println(rand);
    }  while (rand > 0);
  return rand;
}
  
}