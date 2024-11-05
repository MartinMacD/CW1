import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
public class Dec2HexTest {

    public Dec2HexTest()
   {}
    Dec2Hex dec2Hex;
    //Before the testing begins, instantiate the dec2Hex object as a new Dec2Hex.
    @Before
    public void setUp() {
        dec2Hex = new Dec2Hex();
    }

    //First test is to check dec2Hex.convert against a standard number,
    //This test should result in the letter F being output and the test should be a success.
    @Test
    public void testStandardNum() {
        assertEquals("Regular number conversion should work", "F", dec2Hex.convert(15));
    }

    //Second test to check dec2Hex.convert against a null/empty value.
    //This test should result in an error message being output and the test should be a success.
    @Test
    public void testNullInput() {
    assertEquals("Your input was empty, please enter a number", dec2Hex.convert(null));
}

    //Third test is to check dec2Hex.convert against a String value.
    //This test should result in an error message being output and the test should be a success.
    @Test
    public void testStringInput() {
    assertEquals("That is not a number, please enter a number", dec2Hex.convert("abc"));
}
}
