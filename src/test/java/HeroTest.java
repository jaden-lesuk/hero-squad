import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{
  @Test
  public void Hero_instantiatesCorrectly_True(){
    Hero testHero = new Hero("The Incredible Hulk", "Bruce Banner","Male", 32, "Big, green and angry");
    assertEquals(true, testHero instanceof Hero);  
  }
}