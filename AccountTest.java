import java.util.Scanner;



public class AccountTest {
  public static void main(String[] args) {
  // create a scanner object to obtain input from the command window
  Scanner input = new Scanner(System.in);
  
  // create an Account object and assign it to myAccount
  Account MyAccount = new Account();
  
  // display initial value of name (null)
  System.out.printf("Initial name is: %s%n%n", MyAccount.getName());
  // prompt for and read name
  System.out.println("please enter the name:");
  
  String theName = input.nextLine();
  MyAccount.setName(theName); // put theName in myAccount
  System.out.println();   //outputs a blank line
  
  // display the name stored in object MyAccount
  System.out.printf("Name in object MyAccount is:%n%s%n", MyAccount.getName());
    }
  }


