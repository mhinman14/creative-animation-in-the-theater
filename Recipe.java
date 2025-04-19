import org.code.theater.*;
import org.code.media.*;

public class Recipe {
  private String[] ingredients;
  private String[] instructions;
  private String image;

  public Recipe (String[] ingredients, String[] instructions, String image) {
    this.ingredients = ingredients;
    this.instructions = instructions;
    this.image = image;
  }
  public String[] getIngredients() {
    return ingredients;
  }
  public String[] getInstructions() {
    return instructions;
  }
  public String getImage() {
    return image;
  }
}