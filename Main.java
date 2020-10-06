import java.util.Scanner;
/**
 * This program will ask the user for an integer and create a multiplication table for that integer
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user to input an integer
    System.out.println("Please enter an integer to create a multiplication table for");
    int integer = input.nextInt();

    for(int count = 1; count <= 12; count++){
      int total = count * integer;
      System.out.println(count + " x " + integer + " = " + total);
    } 
    
  }
}
