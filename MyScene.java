import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;

public class MyScene extends Scene {

  //Instance Variables
  private Recipe lasagna;
  private Recipe broccoliCheddarSoup;
  private Recipe macAndCheese;
  private String userRecipe;
  
  
  //Constructor(s)
  public MyScene() {
    lasagna = createRecipe("lasagna.txt");
    broccoliCheddarSoup = createRecipe("broccoliCheddarSoup.txt");
    macAndCheese = createRecipe("macAndCheese.txt");
    getUserRecipe();
  }

  /**
   * This is a student developed method
   * Creates the recipe information text from .txt files containing recipe image, ingredients, and instructions
   * @param fileName string checks file name for right recipe
   * @return new recipe created from instructions, ingredients, and image from .txt file
   */
  private Recipe createRecipe(String fileName) {
    String[] recipeData = FileReader.toStringArray(fileName);
    String recipeImage = recipeData[0];
    String[] recipeIngred = recipeData[1].split(",");
    String[] recipeInstruc = recipeData[2].split(",");
    
    return new Recipe(recipeIngred, recipeInstruc, recipeImage);
  }

  /**
   * This is a student developed method
   * Draws the lasagna recipe on theater runner from createRecipe and plays sound
   */
  private void drawLasanga() {
    playSound("484344__inspectorj__bike-bell-ding-single-01-01.wav");
    drawImage(lasagna.getImage(), 9, 31, 200);
   setTextHeight(60);
    drawText("Lasagna", 25, 376);
   setTextHeight(20);
    drawText("Ingredients:", 220, 31);
    int yPos = 51;
    setTextHeight(12);
    for (String ing : lasagna.getIngredients()){
      drawText(ing, 220, yPos);
      yPos += 25;
    }
    // Draw the instructions for the recipe
    setTextHeight(20);
    drawText("Steps:", 220, 200);
    yPos = 220;
    setTextHeight(12);
    for (String instruc : lasagna.getInstructions()){
      drawText(instruc, 220, yPos);
      yPos += 25;
    }
  }

  /**
   * This is a student developed method
   * Draws the broccoli cheddar soup recipe on theater runner from createRecipe and plays sound
   */
   private void drawBroccoliCheddarSoup() {
   playSound("484344__inspectorj__bike-bell-ding-single-01-01.wav");
     drawImage(broccoliCheddarSoup.getImage(), 9, 31, 200);
   setTextHeight(30);
     drawText("Broccoli Cheddar Soup", 25, 376);
     setTextHeight(20);
     drawText("Ingredients:", 220, 31);
     int yPos = 51;
     setTextHeight(12);
    for (String ing : broccoliCheddarSoup.getIngredients()){
      drawText(ing, 220, yPos);
      yPos += 25;
    }
    // Draw the instructions for the recipe
     setTextHeight(20);
     drawText("Steps:", 220, 200);
     yPos = 220;
     setTextHeight(12);
     for (String instruc : broccoliCheddarSoup.getInstructions()){
       drawText(instruc, 220, yPos);
       yPos += 25;
     }
  }

  /**
   * This is a student developed method
   * Draws the mac and cheese recipe on theater runner from createRecipe and plays sound
   */
  private void drawMacAndCheese() {
    // drawImage(macAndCheese,0,0,400);
   playSound("484344__inspectorj__bike-bell-ding-single-01-01.wav");
    drawImage(macAndCheese.getImage(), 9, 31, 200);
    setTextHeight(40);
     drawText("Mac And Cheese", 25, 376);
     setTextHeight(20);
     drawText("Ingredients:", 220, 31);
     int yPos = 51;
     setTextHeight(12);
    for (String ing : macAndCheese.getIngredients()){
      drawText(ing, 220, yPos);
      yPos += 25;
    }
    // Draw the instructions for the recipe
     setTextHeight(20);
     drawText("Steps:", 29, 200);
     yPos = 220;
     setTextHeight(12);
     for (String instruc : macAndCheese.getInstructions()){
       drawText(instruc, 29, yPos);
       yPos += 25;
     }
    // Draw the instructions for the recipe
  }
  
 /**
   * This is a student developed method
   * Draws the recipe on theater runner from user input between 1, 2 and 3
   */
  //Public methods
  public void drawScene() {
    if (userRecipe.equals("1")) {
      drawLasanga();
    } else if (userRecipe.equals("2")) {
      drawBroccoliCheddarSoup();
    } else if (userRecipe.equals("3")) {
      drawMacAndCheese();
    }
  }

  /**
   * This is a student developed method
   * Scanner object prints out question to user and saves user response to instance variable
   */
  private void getUserRecipe() {
    // TODO: Create a scanner object (call it input)
    Scanner input = new Scanner(System.in);
    // Print out the question to the user
    while(true) {
      System.out.println("Hello! Which recipe would you like to make today?");
      System.out.println("1. Lasagna");
      System.out.println("2. Broccoli Cheddar Soup");
      System.out.println("3. Mac and Cheese");
      String userChoice = input.nextLine();
      if (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")) {
        System.out.println("Sorry not a valid option, please chose a valid number.");
        continue;
      } else {
        // Save the user response to a instance variable
        userRecipe = userChoice;
        break;
      }
    }
    // close the scanner
    input.close();
  }

  //Private helper methods
}