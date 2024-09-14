import org.code.neighborhood.*;
 /*
   * Paints a enderman
   */
public class EndermanPainter extends MuralPainter {

public void paintEnderman(String darkColor, String lightColor, String blackColor) {
    getToStartDarkEye();
    paintDarkEye(darkColor);

    resetPosition();

     getToStartLightEye();
    paintLightEye(lightColor);

    resetPosition();

   getToStartSkin();
    paintSkin(blackColor);

    resetPosition();

  
}

 
 /*
   * Moves the painter to the eyes direction 
   */   
  
  public void getToStartDarkEye() {
    turnRight();
    move(); 
    move(); 
    move(); 
    move(); 
    move();
    move(); 
    move();
    turnLeft();
    move();
    move(); 
    move();
    
  
   
  }

 /*
   * Paints the dark part of the eyes 
   */    
  public void paintDarkEye(String color) {
    paintLine(color, 2);

    turnRight();
    move(); 
    turnRight();
    move();

    paintLine(color,2);

    turnRight(); 
    turnRight();
    move(); 
    move(); 
    move();
    move();
    move(); 
    move(); 
    move();
    move();
    move();

    paintLine(color,2);

    turnLeft(); 
    move(); 
    turnLeft();
    move();

    paintLine(color,2);
    turnRight();
    turnRight();
    
  }

  /*
   * moves painter to light eyes 
   */   
  public void getToStartLightEye() {
    turnRight(); 
    move(); 
    move(); 
    move();
    move();
    move(); 
    move(); 
    move();
    
 
   

   
  }

  /*
   * Paints the light part of the eyes 
   */   
  public void paintLightEye(String color) {
   paintLine(color,2);

    turnLeft(); 
    move(); 
    turnLeft();
    move(); 
    paintLine(color,2);

    turnRight(); 
    move(); 
    turnRight(); 
    move(); 
    paintLine(color,2);

    turnLeft(); 
    move(); 
    move(); 
    move(); 
    turnLeft(); 
    move();
    paintLine(color,2);

    turnRight(); 
    move(); 
    turnRight(); 
    move();
    paintLine(color,2);

    turnLeft();
    move(); 
    move(); 
    move(); 
    move(); 
    move(); 
    move();
    move(); 
    turnLeft();
    move();
    paintLine(color,2);

    turnRight();
    move(); 
    turnRight(); 
    move(); 
    paintLine(color,2);

    turnLeft(); 
    move(); 
    turnLeft(); 
    move();
    paintLine(color,2);

    turnLeft(); 
    move(); 
    move(); 
    move(); 
    move(); 
    move(); 
    turnLeft(); 
    move(); 
    paintLine(color,2);

    turnRight(); 
    move(); 
    turnRight(); 
    move(); 
    paintLine(color,2);
 
  }
 
  /*
   * Moves painter to skin 
   */  
  public void getToStartSkin() {
     turnLeft(); 
     move(); 
     move(); 
     move(); 
     move(); 
     move(); 
     move(); 
     move(); 
     move(); 
     move(); 
    
      
    
   
   
  }

  /*
   * Paints the skin
   */   
  public void paintSkin(String color) {
   paintLine(color, 1);

  turnRight();
  turnRight(); 
  move(); 
  paintLine(color,4);
  turnLeft(); 

  move(); 
  turnLeft();
  move(); 
  paintLine(color,5);

  turnRight(); 
  move(); 
  turnRight(); 
  move(); 
  move();
  move();
  paintLine(color,2);

  turnLeft();
  move(); 
  move(); 
  move(); 
  move();
  turnLeft(); 
  move(); 
  move();
  move();
  move();
  paintLine(color,2);

  turnLeft();
  move();
  paintLine(color,3);

  turnLeft(); 
  move(); 
  turnLeft(); 
  move();
  paintLine(color,3);

  turnRight(); 
  move();
  move(); 
  move();
  move();
  paintLine(color,6);
  
  turnRight();
  move();
  turnRight(); 
  move();
  paintLine(color,6);

  turnLeft(); 
  move(); 
  turnLeft(); 
  move();
  move(); 
  paintLine(color,4);

  turnRight(); 
  move();
  turnRight();
  move(); 
  paintLine(color,4);

  turnRight(); 
  turnRight(); 
  move(); 
  move(); 
  move(); 
  move(); 
  move(); 
  move(); 
  move();
  move();
  move(); 
  move(); 
  turnLeft(); 
  move(); 
  move();
  paintLine(color,2);
  
  turnLeft();
  move(); 
  paintLine(color,1);

  turnLeft(); 
  move(); 
  turnLeft();
  move(); 
  paintLine(color,2);    

  turnRight();
  move(); 
  paintLine(color,2);

  turnRight();  
  move(); 
  turnRight(); 
  move(); 
  paintLine(color,2);

  turnLeft(); 
  turnLeft(); 
  move();
  move(); 
  move(); 

  turnLeft();
  move(); 
  turnRight(); 
  move(); 
  paintLine(color,2);

  turnRight(); 
  move(); 
  turnRight();
  move(); 
  turnLeft();
  paintLine(color,4);

  turnRight(); 
  move(); 
  turnRight(); 
  move(); 
  paintLine(color,4);
  turnLeft();
  turnLeft(); 
  move(); 
  move(); 
  turnRight(); 

  paintLine(color,3);
  turnLeft(); 
  move(); 
  turnLeft(); 
  move(); 
  paintLine(color,2);

  move(); 
  move(); 
  move(); 
  move(); 
  turnRight(); 
  paintLine(color,4);

  turnLeft(); 
  move(); 
  turnLeft();
  move(); 
  paintLine(color,4);
  turnRight();

  move(); 
  paintLine(color,2);
  turnLeft(); 
  move(); 
  turnRight(); 
  move(); 
  paintLine(color,2);
  turnLeft(); 
  move(); 
  turnLeft(); 
  paintLine(color,2);

  turnLeft();
  move(); 
  move(); 
  move(); 
  move(); 
  move(); 
  move(); 
  paintLine(color,4);

  turnLeft(); 
  move(); 
  turnLeft(); 
  move();
  paintLine(color,4);
  turnLeft();

  move(); 
  move(); 
  move(); 
  move(); 
  move(); 
  turnLeft(); 
  move(); 
  move(); 
  move(); 
  move();
  paintLine(color,4);

  turnLeft(); 
  move(); 
  turnLeft(); 
  move();
  paintLine(color,4);    
 
  }  
  
}

