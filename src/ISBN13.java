import java.util.Scanner;

public class ISBN13 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the fist 12 digits of an ISBN-13 as a string: ");
    String isbn = input.nextLine();
    
    if (isbn.length() != 12){
      System.out.println(isbn + " is an invalid input");
      System.exit(0);
    } // if invalid input
    
    int sum = 0;
    for (int i = 0; i < isbn.length(); i++){
      if ((i + 1)% 2 != 0)
        sum = sum + isbn.charAt(i) - '0';
      else
        sum = sum + (isbn.charAt(i) - '0') * 3;
    } // for i
    
    sum = 10 - (sum % 10);
    if (sum == 10)
      System.out.println("The ISBN-13 number is " + isbn + "0");
    else
      System.out.println("The ISBN-13 number is " + isbn + sum);
  } // main   
} // ISBN13
