// This small program is a shoplist


import java.util.ArrayList;
import java.util.Scanner;


// Main Class
public class shopList {
	// Global Variable
	static String item = null;
	private static ArrayList<String> theList;
	static int answer;
	
     // main Method
	 public static void main(String[] args){
		// creates a new instance when the program starts
		new shopList();
		System.out.println("Welcome");
		// Calls the first method
		checkIn();
	   }

	 
	 // Constructor to create a new ArrayList
	  public shopList()
	  {
	    theList = new ArrayList<String>();
	  }
	  
	  // Method gives the Menu
	  public static void checkIn(){   
		  //Prints the menu options
		  System.out.println("Menu");
		  System.out.println("Type 1 to Add a new Item");
		  System.out.println("Type 2 to Delete an Item");
		  System.out.println("Type any other number to leave the program");
          
		  // calls the Validation method to check input
		  ValidatingInputInt();
		    // if statement to redirect the user to appropriate method
		  
		    // 1 to add an item
		    if (answer == 1) {
		    	add(item);
		    }
		    
		    // 2 to delete an item
		    else if (answer == 2) {
		       	delete(item);
			}
		    
		    // any other number will finish the program
		    else {
		    	leave();
			} 
	  }
	  
	  // Method to validate Input Int
	  public static void ValidatingInputInt() {
	  // initiates variable as 0
	  answer = 0;
		
	    // scanner to get the input from user
	    Scanner in = new Scanner(System.in);
	    
	    // check it it is an Int
	    if(in.hasNextInt()){
	    	System.out.println("Entered input is integer");
	    	
	    	// if it is and int, store in the variable answer
	    	answer = in.nextInt();
	    	}
	    
	        // otherwise, print the warning, it is not a valid input and
	    else {
	    	System.out.println("This is not an Valid Input, need to be a Number");
	    	
	    	// takes the user back to the menu options
	    	checkIn();
	    }
	    
	  
	  }
	  
	  // Method to add a new item to the list
	  public static void add(String item){
		  // print the message to user to add the item name
		  System.out.println("Enter the name of the item you need to add to your list");
		  // takes the input
		  Scanner input = new Scanner(System.in);
		  // saves the input in a variable
		  item = input.nextLine();
		  
		  // adds the variable to the list
		  theList.add(item);
		  
		  // prints the list
		  shopListPrint();
		  // returns to the main menu
		  checkIn();
	  }

	  // Method to delete an item from the list
	  public static void delete(String item){  
		  
		  // checks of the list is empty
		  // if empty, 
		  if (theList.isEmpty())  	{
			  //prints a message informing the user
		      System.out.println("Your list is empty, you have everythink you need!");
		      // takes the user to the main menu
		      checkIn();
	      } 
		  
		  // if the list is not empty, 
		  else{
			  // prints a message asking the user to type the item he wants to delete
			  System.out.println("What would you like to delete?");
			  
			  // Gets user input
			  Scanner input = new Scanner(System.in);
			  //stores it in a variable
			  item = input.nextLine();
			  
				  // if statement to check if list contains the item
			      // it contains, 
				  if(theList.contains(item)) {
					  // Prints the message the item was found
					  System.out.println("Found it");  
					  // and remove item from ArrayList
					  theList.remove(item);
					  // prints a message with the item name that eas deleted
					  System.out.println(item + " Item was deleted.");
				  
				  // if the list does not contais the item					      
			      } else 
			      // prints the message item was not found
				  System.out.println("Item not found");
			      }
		
		  /*
		  // other way to go through the list
		  System.out.println(item + " deleted.");
	      }
	  
		  for (int i = 0; i < theList.size(); i++) {
			String myName = theList.get(i);
		  		
		  if (item.equals(myName))  	{
			  System.out.println(item + " deleted.");
		      theList.remove(item);
		      break;
		      
		   */
		  
	
	 // Go back to main menu  
	  checkIn();
		  
	  }

	  
	  // Method to leave the program
	  public static void leave(){
		  
		// if statement to determinate the message will be printed
		  
		//if list is empty
	    if (theList.isEmpty())
	    	// prints the message the user does not need anything
	    	System.out.println("Your list is empty, you have everythink you need!");
	    // if list contains any item
	    else {
	        //prints the list
	    	System.out.println("You still have to buy " + String.valueOf(theList.size()) + " items from your shop list :");
	      shopListPrint();
	    }
	  }
      
	  
	  // method to print shoplist
	  public static void shopListPrint(){
		// prints the headline
	    System.out.println("*** Your Shop List");
	    // for loop to go over the list
	    for (String sItem : theList)
	       // prints each item
	       System.out.println(" - " + sItem);
	  }

	
}
