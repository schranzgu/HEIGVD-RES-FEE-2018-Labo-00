package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *       *** IMPORTANT WARNING : DO NOT EDIT THIS FILE ***
 * 
 * This file is used to specify what you have to implement. To check your work,
 * we will run our own copy of the automated tests. If you change this file,
 * then you will introduce a change of specification!!!
 * 
 * @author Olivier Liechti
 */
public class TriangleTest {

  @Test
  public void thereShouldBeAnIInstrumentInterfaceAndATriangleClass() {
    IInstrument triangle = new Triangle();
    assertNotNull(triangle);
  }
  
  @Test
  public void itShouldBePossibleToPlayAnInstrument() {
    IInstrument triangle = new Triangle();
    String sound = triangle.play();
    assertNotNull(sound);
  }
  
  @Test
  public void aTriangleShouldMakePouet() {
    IInstrument triangle = new Triangle();
    String sound = triangle.play();
    Assert.assertEquals("Diing", sound);
  }

  @Test
  public void aTriangleShouldBeGolden() {
    IInstrument triangle = new Triangle();
    String color = triangle.getColor();
    Assert.assertEquals("Braun", color);
  }
 
}