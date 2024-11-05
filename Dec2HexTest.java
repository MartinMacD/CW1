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
    try {
	dec2Hex.convert(null);
	fail("Expected an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}

    @Test
    public void testStringInput() {
    try {
        dec2Hex.convert("abc"); // This will throw an IllegalArgumentException
        fail("Expected an IllegalArgumentException"); // If no exception is thrown, this fails the test
    } catch (IllegalArgumentException e) {
        // Expected exception, test passes
    }
}
}
