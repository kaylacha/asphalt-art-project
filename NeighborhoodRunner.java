import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    //Creates MuralPainter object
    MuralPainter backgroundPainter = new MuralPainter();

  //creats a EnderPainter object   
    EndermanPainter enderman = new EndermanPainter();

   // paints the background 
    backgroundPainter.paintBackground("DimGray", 16);

   // paints the enderman  
    enderman.paintEnderman("BlueViolet", "Violet", "Black");

    
  }
}