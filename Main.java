import java.util.Scanner;

/*
  This program demonstrates the if statement.
*/

public class Main
{
   public static void main(String[] args)
   {
      double score1,   // Score #1
             score2,   // Score #2
             score3,   // Score #3
             average;  // Average score

      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);

      System.out.println("This program averages 3 test scores.");
      
      // Get the first score.
      System.out.print("Enter score #1: ");
      score1 = keyboard.nextDouble();
      
      // Get the second score.
      System.out.print("Enter score #2: ");
      score2 = keyboard.nextDouble ();
      
      // Get the third score.
      System.out.print("Enter score #3: ");
      score3 = keyboard.nextDouble ();
      
      // Calculate and display the average score.
      average = (score1 + score2 + score3) / 3.0;
      System.out.println("The average is " + average);
      
      // If the average is higher than 95, congratulate the user.
      if (average > 95)
         System.out.println("That's a great score!");
   }
} 


/*if average is greater than 95
      print "that's a great score!"*/