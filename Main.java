import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Declare and initialize the scanner
    Scanner s = new Scanner(System.in);
    //Request input
    System.out.println("Enter a number to count down or up from");
    int toCount = s.nextInt();
    //System.out.println("Selected start: " + toCount);
    System.out.println("Beginning Countdown:");
    //For positives (countdown)
    if (toCount >= 0) {
      while (toCount >= 0) {
        System.out.println(toCount);
        toCount--;
      }        
    } 
    //For negatives (countup)
    else{
        while(toCount <= 0){
          System.out.println(toCount);
          toCount++;
        }
    }
    //Closing message
    System.out.println("Blast off!");
  }
}