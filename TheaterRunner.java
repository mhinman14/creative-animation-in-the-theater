import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

  MyScene scene = new MyScene();

    scene.drawScene();

    Theater.playScenes(scene);

    
    
    
  }
}