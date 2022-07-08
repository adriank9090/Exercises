import org.example.Palindrom;
import org.testng.annotations.Test;

import static org.junit.Assert.*;
import static org.testng.Assert.expectThrows;

public class PalindromTest {

    @Test

    public void palindrom() {

        Palindrom palindrom = new Palindrom("check");
        assertTrue(palindrom.isPalindrom());
        assertFalse(palindrom.isPalindrom());

    }

    @Test

    public void assertException() {
        Palindrom palindrom = new Palindrom(null);
        IllegalArgumentException illegalArgumentException = expectThrows(IllegalArgumentException.class, palindrom::isPalindrom);
        assertEquals(illegalArgumentException.getMessage(), "invalid value passed to method");
    }




}