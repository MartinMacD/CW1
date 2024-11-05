import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
public class Dec2HexTest {

    public Dec2HexTest()
   {}
    Dec2Hex dec2Hex;

    @Before
    public void setUp() {
        dec2Hex = new Dec2Hex();
    }

    @Test
    public void testStandardNum() {
        assertEquals("Regular number conversion should work", "F", dec2Hex.convert(15));
    }

    @Test
    public void testNullInput() {
    assertEquals("Your input was empty, please enter a number", dec2Hex.convert(null));
}

    @Test
    public void testStringInput() {
    assertEquals("That is not a number, please enter a number", dec2Hex.convert("abc"));
}
}
