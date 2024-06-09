import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class UserInputPangramCheckerTest {

    @Test
    public void testUserInputPangramChecker() {
        String pangramInput = "The quick brown fox jumps over the lazy dog";
        String nonPangramInput = "This is not a pangram";

        // Set up user input for testing
        InputStream inputStream1 = new ByteArrayInputStream(pangramInput.getBytes());
        InputStream inputStream2 = new ByteArrayInputStream(nonPangramInput.getBytes());
        System.setIn(inputStream1);

        // Test Pangram
        assertTrue(UserInputPangramChecker.isPangram(new Scanner(System.in).nextLine()));

        // Reset System.in for the next test
        System.setIn(inputStream2);

        // Test Non-Pangram
        assertFalse(UserInputPangramChecker.isPangram(new Scanner(System.in).nextLine()));
    }
}
