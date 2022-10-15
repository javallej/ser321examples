import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   //SER321 3.3. Understanding Gradle (7.5 points)
   public Fraction(int num, int den) {
      this.numerator = num;
      this.denominator = den;
   }

   public Fraction(int num) {
      this.numerator = num;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      try {
         // create a new instance
         // Fraction *frac = [[Fraction alloc] init];

         //Code Checking
         //https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html
         int firstinline;
         int secondinline;

         System.out.println(args.length);
         if(args.length == 0) {
            try {
               Fraction frac = new Fraction();
               frac.setNumerator(1);
               frac.setDenominator(3);
               // print it
               System.out.print("The fraction is: ");
               frac.print();
               System.out.println("");
            }
            catch (NumberFormatException e) {
               System.err.println("Argument must be an integer");
            }
         } else if (args.length == 1) {
            try {
               firstinline = Integer.parseInt(args[0]);
               Fraction frac = new Fraction(firstinline, 3);
               // print it
               System.out.print("The fraction is: ");
               frac.print();
               System.out.println("");
            }
            catch (NumberFormatException e) {
               System.err.println("Argument must be an integer");
            }
         }
         else if (args.length == 2) {
            try {
               firstinline = Integer.parseInt(args[0]);
               secondinline = Integer.parseInt(args[1]);
               Fraction frac = new Fraction(firstinline,secondinline);
               // print it
               System.out.print("The fraction is: ");
               frac.print();
               System.out.println("");
            }
            catch (NumberFormatException e) {
               System.err.println("Argument must be an integer");
            }
         }

      }catch(Exception e) {
         e.printStackTrace();
      }
   }
}

