package Task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BurrowsWheelerControllerTest {
    private final BurrowsWheelerController underTest = new
            BurrowsWheelerController();
    @Test
    void testEncode() {
        String expectedResult = "annb$aa";
        String phrase = "banana";
        String actualResult = underTest.encode(phrase);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testEncodeWithIncorrectInput() {
        String phrase = "$$ome text";
        assertThrows(RuntimeException.class, () -> underTest.encode(phrase));
    }
    @Test
    void testDecode() {
        String expectedResult = "banana";
        String phrase = "annb$aa";
        String actualResult = underTest.decode(phrase);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testDecodeWithIncorrectInput() {
        String phrase = "some text";
        assertThrows(RuntimeException.class, () -> underTest.decode(phrase));
    }
}