import org.code.neighborhood.*;

/*
 * 
 * 
 */
public class MuralPainter extends PainterPlus {

  /*
   * 
   * 
   */
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();

      if (canMove("south")) {
        paintLine(color, size);
        turnToEast();
      }
    }

    paintLine(color, size);
    turnAround();
    moveToCorner();
  }

  /*
   * 
   *
   */
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }

  /*
   * 
   * 
   */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  /*
   * 
   * 
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  /*
   * 
   */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  /*
   * 
   */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

  /*
   * 
   */
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }
  
}

